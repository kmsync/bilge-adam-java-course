package com.bilgeadam.start.model.entity;

import com.bilgeadam.start.model.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "country")
@Getter
@Setter
public class Country extends BaseEntity {
    private String name;

    // İlişkiyi yöneten taraf her türlü yazma okuma update etme işini yapabilir.
    @OneToMany
    @JoinColumn(name = "country_id")
    @OrderColumn(name = "city_order")
    public List<City> cityList;
}
