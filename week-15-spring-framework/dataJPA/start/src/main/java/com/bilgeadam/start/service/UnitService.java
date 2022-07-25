package com.bilgeadam.start.service;

import com.bilgeadam.start.model.dto.StockWithoutUnitDTO;
import com.bilgeadam.start.model.dto.UnitStockDTO;
import com.bilgeadam.start.model.entity.Unit;
import com.bilgeadam.start.model.entity.Stock;
import com.bilgeadam.start.repository.UnitRepository;
import com.bilgeadam.start.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// TODO Unit'leri savedekine benzer bir mantıkla var olan bir unit için update edecek yöntemi geliştiriniz.

@Service
@RequiredArgsConstructor
public class UnitService {
    private final UnitRepository unitRepository;
    private final StockRepository stockRepository;

    /**
     * Gelen stoklar da unit ile birlikte kaydedilebilsin.
     * Sadece unit kaydı yapılabilsin.
     * Halihazırda varolan stocklar unit ile ilişkilendirilebilsin.
     * @param unitStockDTO
     * @return
     */
    public UnitStockDTO save(UnitStockDTO unitStockDTO) {
        Unit unit = this.unitRepository.save(new Unit(unitStockDTO));

        List<Stock> stockList = new ArrayList<>();
        for (StockWithoutUnitDTO stockWithoutUnitDTO : unitStockDTO.getStocks()) {
            Stock stock;
            if (stockWithoutUnitDTO.getId() != null) {
                Optional<Stock> stockOptional = this.stockRepository.findById(stockWithoutUnitDTO.getId());
                if (stockOptional.isPresent()) {
                    stock = stockOptional.get();
                    this.updateStockFields(stock, stockWithoutUnitDTO);
                } else {
                    stock = new Stock(stockWithoutUnitDTO);
                    this.updateStockFields(stock,stockWithoutUnitDTO);
                }
            } else {
                stock = new Stock(stockWithoutUnitDTO);
            }
            stock.setUnit(unit);
            Stock savedStock = this.stockRepository.save(stock);
            stockList.add(savedStock);
        }
        unit.setStocks(stockList);

        // Kullanıcıya en güncel unit'i göstermek için
        UnitStockDTO unitStockResponse = this.stockMapToStockUnitDTO(unit);
        return unitStockResponse;
    }



    public void updateStockFields(Stock stock, StockWithoutUnitDTO stockWithoutUnitDTO){
        stock.setName(stockWithoutUnitDTO.getName());
        stock.setQuantity(stockWithoutUnitDTO.getQuantity());
        stock.setBoughtPrice(stockWithoutUnitDTO.getBoughtPrice());
        stock.setSellPrice(stockWithoutUnitDTO.getSellPrice());
        stock.setStockCode(stockWithoutUnitDTO.getStockCode());
        stock.setBarcode(stockWithoutUnitDTO.getBarcode());
        stock.setIsAlive(stockWithoutUnitDTO.getIsAlive());
    }

/*    //Meric
    public Unit saveMeric(UnitStockDTO unitStockDTO){
        Unit unit = new Unit();
        unit.setName(unitStockDTO.getName());
        List<StockWithoutUnitDTO> stocks = unitStockDTO.getStocks();
        if(stocks.isEmpty()){
            return this.unitRepository.save(unit);
        } else {
            stocks.stream().map(stock -> {
                if(this.stockRepository.existsById(stock.getId())){
                    Stock stockEntity = new Stock(stock);
                    this.stockRepository.save(stockEntity);
                }
            });
        }
        return null;
//        return this.unitRepository.save(unit);
    }*/

/*    public Unit save2(UnitStockDTO unitStockDTO){
        return this.unitRepository.save(unit);
    }*/

    public List<UnitStockDTO> findAll() {
        List<Unit> units = this.unitRepository.findAll();
        return units.stream()
                .map(this::stockMapToStockUnitDTO)
                .collect(Collectors.toList());
    }

    public UnitStockDTO stockMapToStockUnitDTO(Unit unit){
        UnitStockDTO unitStockDTO = new UnitStockDTO(unit);
        List<StockWithoutUnitDTO> stockWithoutUnitDTOS = unit.getStocks().stream()
                .map(StockWithoutUnitDTO::new)
                .collect(Collectors.toList());
        unitStockDTO.setStocks(stockWithoutUnitDTOS);
        return unitStockDTO;
    }

    public UnitStockDTO findById(Long id) {
        Optional<Unit> unitOptional = this.unitRepository.findById(id);
        if(unitOptional.isPresent()){
            Unit unit = unitOptional.get();
            return this.stockMapToStockUnitDTO(unit);
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"id ile unit bulunamadı.");
        }
    }
}
