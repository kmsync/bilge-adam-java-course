package com.bilgeadam.start.model.entity;

import com.bilgeadam.start.model.dto.UnitDTO;
import com.bilgeadam.start.model.dto.UnitStockDTO;
import com.bilgeadam.start.model.entity.base.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="unit")
@Getter
@Setter
@NoArgsConstructor
public class Unit extends BaseEntity {
    private String name;

    /*@OneToMany
    @JoinColumn(name = "unit_id")*/
    //@JsonIgnore
    @OneToMany(mappedBy = "unit")
    private List<Stock> stocks = new ArrayList<>();

    public Unit(UnitDTO unitDTO){
        super(unitDTO.getId());
        this.name = unitDTO.getName();
    }

    public Unit(UnitStockDTO unitDTO){
        this.name = unitDTO.getName();
    }
}
