package com.bilgeadam.start.model.entity;

import com.bilgeadam.start.model.dto.StockDTO;
import com.bilgeadam.start.model.dto.StockWithoutUnitDTO;
import com.bilgeadam.start.model.entity.base.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
@Getter
@Setter
@NamedQuery(name = "Stock.say", query = "SELECT count(s.id) FROM Stock s")
@NoArgsConstructor
public class Stock extends BaseEntity {

    private String name;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "bought_price")
    private Double boughtPrice;

    @Column(name = "sell_price")
    private Double sellPrice;

    @Column(name = "stock_code")
    private Long stockCode;

    @Column(name = "barcode")
    private Long barcode;

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;

    @Column(name = "isAlive")
    private Boolean isAlive;

    public Stock(StockDTO stockDTO) {
        this.name = stockDTO.getName();
        this.quantity = stockDTO.getQuantity();
        this.boughtPrice = stockDTO.getBoughtPrice();
        this.sellPrice = stockDTO.getSellPrice();
        this.stockCode = stockDTO.getStockCode();
        this.barcode = stockDTO.getBarcode();
        this.isAlive = stockDTO.getIsAlive();
        Unit unit = new Unit(stockDTO.getUnit());
        this.unit = unit;
    }

    public Stock(StockWithoutUnitDTO stockWithoutUnitDTO) {
        this.name = stockWithoutUnitDTO.getName();
        this.quantity = stockWithoutUnitDTO.getQuantity();
        this.boughtPrice = stockWithoutUnitDTO.getBoughtPrice();
        this.sellPrice = stockWithoutUnitDTO.getSellPrice();
        this.stockCode = stockWithoutUnitDTO.getStockCode();
        this.barcode = stockWithoutUnitDTO.getBarcode();
        this.isAlive = stockWithoutUnitDTO.getIsAlive();
    }
}
