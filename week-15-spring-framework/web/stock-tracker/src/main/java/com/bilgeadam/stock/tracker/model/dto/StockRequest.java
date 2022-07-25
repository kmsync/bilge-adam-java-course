package com.bilgeadam.stock.tracker.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StockRequest {

    private Long id;
    private String name;
    private Integer quantity;
    private Double boughtPrice;
    private Double sellPrice;
    private UnitRequest unit;
}
