package com.bilgeadam.start.model.entity;

import com.bilgeadam.start.model.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "city")
@Getter
@Setter
public class City extends BaseEntity {
    private String name;

    // Yönetilen taraf sadece okunabilir
    @ManyToOne
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    private Country country;
}
