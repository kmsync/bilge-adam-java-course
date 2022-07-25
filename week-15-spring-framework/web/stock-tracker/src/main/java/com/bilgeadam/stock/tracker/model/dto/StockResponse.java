package com.bilgeadam.stock.tracker.model.dto;

import com.bilgeadam.stock.tracker.model.entity.Stock;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StockResponse {
    private Long id;
    private String name;
    private Integer quantity;
    private Double boughtPrice;
    private Double sellPrice;
    private Long stockCode;
    private Long barcode;
    private UnitResponse unit;

    public StockResponse(Stock stock){
        this.id = stock.getId();
        this.name = stock.getName();
        this.quantity = stock.getQuantity();
        this.boughtPrice = stock.getBoughtPrice();
        this.sellPrice = stock.getSellPrice();
        this.stockCode = stock.getStockCode();
        this.barcode = stock.getBarcode();
        this.unit = new UnitResponse(stock.getUnit());
    }
}
