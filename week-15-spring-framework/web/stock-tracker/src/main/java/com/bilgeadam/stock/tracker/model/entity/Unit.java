package com.bilgeadam.stock.tracker.model.entity;

import com.bilgeadam.stock.tracker.model.dto.UnitRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.ResultSet;
import java.sql.SQLException;

@Getter
@Setter
@AllArgsConstructor
public class Unit {
    private Long id;
    private String name;

    public Unit(UnitRequest unitRequest){
        this.id = unitRequest.getId();
        this.name = unitRequest.getName();
    }

    public Unit(ResultSet resultSet) throws SQLException {
        this.id = resultSet.getLong("id");
        this.name = resultSet.getString("name");
    }
}
