package com.bilgeadam.start.service;

import com.bilgeadam.start.model.dto.StockDTO;
import com.bilgeadam.start.model.entity.Stock;
import com.bilgeadam.start.model.entity.Unit;
import com.bilgeadam.start.repository.StockRepository;
import com.bilgeadam.start.repository.UnitRepository;
import com.bilgeadam.start.repository.projections.StockProjection;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StockService {

    private final StockRepository stockRepository;
    private final UnitRepository unitRepository;

    public List<StockDTO> findAll() {
        List<Stock> stockList = this.stockRepository.findAll();

        List<StockDTO> stockDTOS = stockList.stream()
                .map(StockDTO::new)
                .collect(Collectors.toList());
        return stockDTOS;
    }

    public StockDTO save(StockDTO stockDTO){
        Stock stock = new Stock(stockDTO);
        if(stock.getUnit().getId() == null
                || !this.unitRepository.existsById(stock.getUnit().getId())){

            Unit unit = this.unitRepository.save(stock.getUnit());
            stock.setUnit(unit);
        }
        Stock savedStock = this.stockRepository.save(stock);
        return new StockDTO(savedStock);
    }

    public List<Stock> findByQuantity(Integer quantity){
        return this.stockRepository.findByQuantity(quantity);
    }

    public List<Stock> findByQuantityLessThan(Integer quantity){
        return this.stockRepository.findByQuantityLessThan(quantity);
    }

    @Transactional
    public void deleteByBarcode(Long barcode){
        this.stockRepository.deleteByBarcode(barcode);
    }

    public List<Stock> findByBarcodeWithProjection(Long barcode){
        List<StockProjection> stocks = this.stockRepository.findByBarcode(barcode);

        Integer count = this.stockRepository.say();

        List<Stock> stockList = this.stockRepository.a(3005119297L);
        List<Stock> stockList2 = this.stockRepository.b(3005119297L);

        return stocks.stream().map(stockProjection -> {
            Stock stock = new Stock();
            stock.setBarcode(stockProjection.getBarcode());
            stock.setName(stockProjection.getName());
            return stock;
        }).collect(Collectors.toList());
    }

    public StockDTO findById(Long id) {
        Optional<Stock> stockOptional = this.stockRepository.findById(id);
        if(stockOptional.isPresent()){
            Stock stock = stockOptional.get();
            return new StockDTO(stock);
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Hatalı stok id.");
        }

        /*Stock stock  = this.stockRepository.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.BAD_REQUEST,
                                "Hatalı stok id."));*/

    }
}
