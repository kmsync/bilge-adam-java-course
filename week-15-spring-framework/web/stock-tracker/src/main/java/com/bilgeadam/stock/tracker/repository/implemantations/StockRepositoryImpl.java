package com.bilgeadam.stock.tracker.repository.implemantations;

import com.bilgeadam.stock.tracker.model.entity.Stock;
import com.bilgeadam.stock.tracker.repository.StockRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StockRepositoryImpl implements StockRepository {
    private final Logger logger = LoggerFactory.getLogger(StockRepositoryImpl.class);

    private final Connection connection;

    public StockRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    private final String COLUMN_DEFINITION_SQL = " s.id as id, " +
            "s.name as name, " +
            "s.quantity as quantity, " +
            "s.bought_price as bought_price, " +
            "s.sell_price as sell_price, " +
            "s.stock_code as stock_code, " +
            "s.barcode as barcode, " +
            "u.id as unit_id, " +
            "u.name as unit_name ";

    private final String STOCK_BASE_SELECT_SQL = "select" + COLUMN_DEFINITION_SQL + "from stock s" +
            " inner join unit u on s.unit_id = u.id";

    @Override
    public void save(Stock stock) {
        String sql = "insert into stock(" +
                "name," +
                "quantity," +
                "bought_price," +
                "sell_price," +
                "stock_code," +
                "barcode," +
                "unit_id" +
                ") values (?,?,?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, stock.getName());
            statement.setInt(2, stock.getQuantity());
            statement.setDouble(3, stock.getBoughtPrice());
            statement.setDouble(4, stock.getSellPrice());
            statement.setDouble(5, stock.getStockCode());
            statement.setLong(6, stock.getBarcode());
            statement.setLong(7, stock.getUnit().getId());
            statement.executeUpdate();
            logger.info(stock.getBarcode() + " barkodlu stok kaydı başarıyla yapıldı.");
        } catch (SQLException e) {
            logger.error("Kayıt atılırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public List<Stock> findAll() {
        String sql = STOCK_BASE_SELECT_SQL;
        List<Stock> stocks = new ArrayList<>();
        try (Statement statement = this.connection.createStatement()) {
            statement.executeQuery(sql);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                stocks.add(new Stock(resultSet));
            }
            logger.info("Stoklar başarıyla getirildi.");
        } catch (SQLException e) {
            logger.error("Kayıt atılırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return stocks;
    }

    @Override
    public Optional<Stock> findById(Long id) {
        String sql = STOCK_BASE_SELECT_SQL + " where s.id = " + id;

        try (Statement statement = this.connection.createStatement()) {
            statement.executeQuery(sql);
            ResultSet resultSet = statement.getResultSet();

            if (resultSet.next()) {
                logger.info(id + "'id li stok başarıyla getirildi.");
                return Optional.of(new Stock(resultSet));
            }
            logger.info(id + "'id li stok bulunamadı.");
        } catch (SQLException e) {
            logger.error("Kayıt atılırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return Optional.empty();
    }

    @Override
    public Stock update(Stock stock) {
        String sql = "update stock set " +
                "name=?, " +
                "quantity=?, " +
                "bought_price= ?, " +
                "sell_price= ?, " +
                "stock_code= ?, " +
                "barcode= ?, " +
                "unit_id= ? " +
                "where id = ?";

        try (PreparedStatement statement = this.connection.prepareStatement(sql)) {
            statement.setString(1, stock.getName());
            statement.setInt(2, stock.getQuantity());
            statement.setDouble(3, stock.getBoughtPrice());
            statement.setDouble(4, stock.getSellPrice());
            statement.setLong(5, stock.getStockCode());
            statement.setLong(6, stock.getBarcode());
            statement.setLong(7, stock.getUnit().getId());
            statement.setLong(8, stock.getId());
            statement.executeUpdate();
            logger.info(stock.getBarcode() + " barkodlu stok başarıyla güncelledi.");
        } catch (SQLException e) {
            logger.error("Kayıt atılırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return this.findById(stock.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Beklenmedik bir hata oluştu."));
    }

    @Override
    public void delete(Long id) {
        String sql = "delete from stock where id = " + id;

        try (Statement statement = this.connection.createStatement()) {
            statement.executeUpdate(sql);
            logger.info(id + " numaralı kayıt başarıyla silindi.");
        } catch (SQLException e) {
            logger.error("Kayıt atılırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @Override
    public List<Stock> findAllSellAndBoughtPriceAndQuantity() {
        String sql = "select s.sell_price, s.bought_price, s.quantity from stock s";
        List<Stock> stocks = new ArrayList<>();
        try (Statement statement = this.connection.createStatement()) {
            statement.executeQuery(sql);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                stocks.add(new Stock(resultSet.getDouble("bought_price"), resultSet.getDouble("sell_price"), resultSet.getInt(3)));
            }
        } catch (SQLException e) {
            logger.error("İstatistik hesaplanırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return stocks;
    }

    @Override
    public Double findProfitFromAllStocks() {
        String sql = "select sum((s.sell_price - s.bought_price)*s.quantity) as profit from stock s";
        try (Statement statement = this.connection.createStatement()) {
            statement.executeQuery(sql);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                return resultSet.getDouble("profit");
            }
        } catch (SQLException e) {
            logger.error("İstatistik hesaplanırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return 0d;
    }

    @Override
    public Boolean isStockExists(Long barcode, Long stockCode) {
        String sql = "select exists(select * from stock where barcode=? and stock_code=?)";
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, barcode);
            preparedStatement.setLong(2, stockCode);
            preparedStatement.executeQuery();
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                return resultSet.getBoolean(1);
            }
        } catch (SQLException e) {
            logger.error("Kaydın varlığı sorgulanırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return false;
    }

    @Override
    public Optional<Stock> findByBarcodeAndStockCode(Long barcode, Long stockCode) {
        String sql = STOCK_BASE_SELECT_SQL + " where s.barcode=? and s.stock_code=?";
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, barcode);
            preparedStatement.setLong(2, stockCode);
            preparedStatement.executeQuery();
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                return Optional.of(new Stock(resultSet));
            }
        } catch (SQLException e) {
            logger.error("Kaydın varlığı sorgulanırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return Optional.empty();
    }
}
