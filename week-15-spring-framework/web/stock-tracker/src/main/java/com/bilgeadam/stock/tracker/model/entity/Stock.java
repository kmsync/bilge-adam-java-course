package com.bilgeadam.stock.tracker.model.entity;

import com.bilgeadam.stock.tracker.model.dto.StockRequest;
import lombok.Getter;
import lombok.Setter;

import java.sql.ResultSet;
import java.sql.SQLException;

@Getter
@Setter
public class Stock {

    private Long id;
    private String name;
    private Integer quantity;
    private Double boughtPrice;
    private Double sellPrice;
    private Long stockCode;
    private Long barcode;
    private Unit unit;

    public Stock(StockRequest stockRequest, Long stockCode, Long barcode){
        this.name = stockRequest.getName();
        this.quantity = stockRequest.getQuantity();
        this.boughtPrice = stockRequest.getBoughtPrice();
        this.sellPrice = stockRequest.getSellPrice();
        this.stockCode = stockCode;
        this.barcode = barcode;
        this.unit = new Unit(stockRequest.getUnit());
    }

    public Stock(StockRequest stockRequest, Long stockCode, Long barcode, Long id){
        this.name = stockRequest.getName();
        this.quantity = stockRequest.getQuantity();
        this.boughtPrice = stockRequest.getBoughtPrice();
        this.sellPrice = stockRequest.getSellPrice();
        this.stockCode = stockCode;
        this.barcode = barcode;
        this.unit = new Unit(stockRequest.getUnit());
        this.id = id;
    }

    public Stock(Double boughtPrice, Double sellPrice, Integer quantity){
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
    }

    public Stock(ResultSet resultSet) throws SQLException {
        this.id = resultSet.getLong("id");
        this.name = resultSet.getString("name");
        this.quantity = resultSet.getInt("quantity");
        this.boughtPrice = resultSet.getDouble("bought_price");
        this.sellPrice = resultSet.getDouble("sell_price");
        this.stockCode = resultSet.getLong("stock_code");
        this.barcode = resultSet.getLong("barcode");
        this.unit = new Unit(resultSet.getLong("unit_id"),resultSet.getString("unit_name"));
    }
}
