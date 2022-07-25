package com.bilgeadam.stock.tracker.controller;

import com.bilgeadam.stock.tracker.model.dto.UnitResponse;
import com.bilgeadam.stock.tracker.service.UnitService;
import com.bilgeadam.stock.tracker.model.dto.UnitRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/unit")
@RequiredArgsConstructor
public class UnitController {

    private final UnitService unitService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody UnitRequest unitRequest) throws URISyntaxException {
        this.unitService.save(unitRequest);
        return ResponseEntity.created(new URI("/unit")).build();
    }

    @GetMapping
    public ResponseEntity<List<UnitResponse>> findAll() {
        return ResponseEntity.ok(this.unitService.findAll());
    }

    @GetMapping(params = "id")
    public ResponseEntity<UnitResponse> findById(@RequestParam Long id) {
        return ResponseEntity.ok(this.unitService.findById(id));
    }

    @PutMapping
    public ResponseEntity<UnitResponse> update(@RequestBody UnitRequest unitRequest) {
        return ResponseEntity.ok(this.unitService.update(unitRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.unitService.delete(id);
        return ResponseEntity.ok().build();
    }
}
