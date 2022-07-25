package com.bilgeadam.stock.tracker.service;

import com.bilgeadam.stock.tracker.model.dto.UnitRequest;
import com.bilgeadam.stock.tracker.model.dto.UnitResponse;
import com.bilgeadam.stock.tracker.model.entity.Unit;
import com.bilgeadam.stock.tracker.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UnitService {

    private final UnitRepository unitRepository;

    /*
    Lombok kullanıldığı için yazılmayabilir. @RequiredArgsConstructor
    public UnitService(UnitRepository unitRepository){
        this.unitRepository = unitRepository;
    }*/

    public void save(UnitRequest unitRequest) {
        Unit unit = new Unit(unitRequest);
        this.unitRepository.save(unit);
    }

    public List<UnitResponse> findAll() {
        return this.unitRepository.findAll()
                .stream()
                .map(UnitResponse::new)
                .collect(Collectors.toList());
    }

    public UnitResponse findById(Long id) {
        Unit unit = this.unitRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Birim bulunamadı."));
        return new UnitResponse(unit);
    }

    public UnitResponse update(UnitRequest unitRequest) {
        Unit unit = this.unitRepository.update(new Unit(unitRequest));
        return new UnitResponse(unit);
    }

    public void delete(Long id) {
        this.unitRepository.delete(id);
    }
}
