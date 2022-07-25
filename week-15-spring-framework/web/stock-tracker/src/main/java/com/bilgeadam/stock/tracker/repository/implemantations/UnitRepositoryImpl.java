package com.bilgeadam.stock.tracker.repository.implemantations;

import com.bilgeadam.stock.tracker.model.entity.Unit;
import com.bilgeadam.stock.tracker.repository.UnitRepository;
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
public class UnitRepositoryImpl implements UnitRepository {

    private final Logger logger = LoggerFactory.getLogger(UnitRepositoryImpl.class);

    private final Connection connection;

    public UnitRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Unit unit) {
        String sql = "insert into unit(name) values (?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, unit.getName());
            statement.executeUpdate();
            logger.info(unit.getName() + "isimli unit eklendi");
        } catch (SQLException e) {
            logger.error("Kayıt oluşturulurken hata aldı SQL State: " + e.getSQLState() + "Reason :" + e.getMessage());
        }
    }

    @Override
    public List<Unit> findAll() {
        String sql = "select * from unit;";
        List<Unit> units = new ArrayList<>();
        try (Statement statement = this.connection.createStatement()) {
            statement.executeQuery(sql);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                units.add(new Unit(resultSet));
            }
        } catch (SQLException e) {
            logger.error("Kayit alirken bir hata olustu" +
                    "SQL State: " + e.getSQLState() +
                    "Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return units;
    }

    @Override
    public Optional<Unit> findById(Long id) {
        String sql = "select * from unit where id = " + id;
        try (Statement statement = this.connection.createStatement()) {
            statement.executeQuery(sql);
            ResultSet resultSet = statement.getResultSet();

            while (resultSet.next()) {
                return Optional.of(new Unit(resultSet));
            }
        } catch (SQLException e) {
            logger.error("Kayit alirken bir hata olustu" +
                    "SQL State: " + e.getSQLState() +
                    "Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return Optional.empty();
    }

    @Override
    public Unit update(Unit unit) {
        String sql = "update unit set name=? where id=?";

        try (PreparedStatement statement = this.connection.prepareStatement(sql)) {
            statement.setString(1, unit.getName());
            statement.setLong(2, unit.getId());
            statement.executeUpdate();
            logger.info(unit.getId() + " id'li unit başarıyla güncelledi.");
        } catch (SQLException e) {
            logger.error("Kayıt atılırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return this.findById(unit.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Beklenmedik bir hata oluştu."));
    }

    @Override
    public void delete(Long id) {
        String sql = "delete from unit where id = " + id;

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
}
