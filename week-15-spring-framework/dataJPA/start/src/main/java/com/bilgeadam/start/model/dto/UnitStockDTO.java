package com.bilgeadam.start.model.dto;

import com.bilgeadam.start.model.entity.Unit;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
// Unit service için
public class UnitStockDTO {
    private Long id;
    private String name;
    private List<StockWithoutUnitDTO> stocks;

    public UnitStockDTO(Unit unit){
        this.id = unit.getId();
        this.name = unit.getName();
    }
}
