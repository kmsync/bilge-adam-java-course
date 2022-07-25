package com.bilgeadam.start.model.dto;

import com.bilgeadam.start.model.entity.Stock;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StockWithoutUnitDTO {
    private Long id;
    private String name;
    private Integer quantity;
    private Double boughtPrice;
    private Double sellPrice;
    private Long stockCode;
    private Long barcode;
    private Boolean isAlive;

    public StockWithoutUnitDTO(Stock stock){
        this.id = stock.getId();
        this.name = stock.getName();
        this.quantity = stock.getQuantity();
        this.boughtPrice = stock.getBoughtPrice();
        this.sellPrice = stock.getSellPrice();
        this.stockCode = stock.getStockCode();
        this.barcode = stock.getBarcode();
        this.isAlive = stock.getIsAlive();
    }
}
