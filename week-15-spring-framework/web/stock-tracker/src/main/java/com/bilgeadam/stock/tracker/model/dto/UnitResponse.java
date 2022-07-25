package com.bilgeadam.stock.tracker.model.dto;

import com.bilgeadam.stock.tracker.model.entity.Unit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UnitResponse {
    private Long id;
    private String name;

    public UnitResponse(Unit unit){
        this.id = unit.getId();
        this.name = unit.getName();
    }
}
