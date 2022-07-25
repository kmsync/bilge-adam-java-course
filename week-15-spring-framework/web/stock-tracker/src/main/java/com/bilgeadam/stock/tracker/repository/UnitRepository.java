package com.bilgeadam.stock.tracker.repository;

import com.bilgeadam.stock.tracker.model.entity.Unit;
import com.bilgeadam.stock.tracker.repository.base.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends CrudRepository<Unit,Long> {
}
