package com.bilgeadam.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bilgeadam.start.model.entity.Unit;


public interface UnitRepository extends JpaRepository<Unit, Long> {

}
