package com.bilgeadam.stock.tracker.repository;

import com.bilgeadam.stock.tracker.model.entity.Stock;
import com.bilgeadam.stock.tracker.repository.base.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StockRepository extends CrudRepository<Stock,Long> {
    List<Stock> findAllSellAndBoughtPriceAndQuantity();
    Double findProfitFromAllStocks();

    Boolean isStockExists(Long barcode, Long stockCode);

    Optional<Stock> findByBarcodeAndStockCode(Long barcode, Long stockCode);
}
