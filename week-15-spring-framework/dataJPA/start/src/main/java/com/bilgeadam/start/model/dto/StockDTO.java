package com.bilgeadam.start.model.dto;

import com.bilgeadam.start.model.entity.Stock;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StockDTO {
    private String name;
    private Integer quantity;
    private Double boughtPrice;
    private Double sellPrice;
    private Long stockCode;
    private Long barcode;
    private UnitDTO unit;
    private Boolean isAlive;

    public StockDTO(Stock stock){
        this.name = stock.getName();
        this.quantity = stock.getQuantity();
        this.boughtPrice = stock.getBoughtPrice();
        this.sellPrice = stock.getSellPrice();
        this.stockCode = stock.getStockCode();
        this.barcode = stock.getBarcode();
        this.isAlive = stock.getIsAlive();
        UnitDTO unitDTO = new UnitDTO();
        unitDTO.setId(stock.getUnit().getId());
        unitDTO.setName(stock.getUnit().getName());
        this.unit = unitDTO;
    }
}
