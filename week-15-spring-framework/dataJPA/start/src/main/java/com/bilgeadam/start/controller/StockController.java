package com.bilgeadam.start.controller;

import com.bilgeadam.start.model.dto.StockDTO;
import com.bilgeadam.start.model.entity.Stock;
import com.bilgeadam.start.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping
    public ResponseEntity<List<StockDTO>> findAll(){
        return ResponseEntity.ok(this.stockService.findAll());
    }

    // /stock/1
    @GetMapping("/{stockId}")
    public ResponseEntity<StockDTO> findById(@PathVariable("stockId") Long id){
        return ResponseEntity.ok(this.stockService.findById(id));
    }

    @PostMapping
    public ResponseEntity<StockDTO> save(@RequestBody StockDTO stock){
        return ResponseEntity.ok(this.stockService.save(stock));
    }

    @GetMapping(params = "quantity")
    public ResponseEntity<List<Stock>> findByQuantity(@RequestParam Integer quantity){
        return ResponseEntity.ok(this.stockService.findByQuantity(quantity));
    }

    @GetMapping(params = "quantityLessThan")
    public ResponseEntity<List<Stock>> findByQuantityLessThan(@RequestParam Integer quantityLessThan){
        return ResponseEntity.ok(this.stockService.findByQuantityLessThan(quantityLessThan));
    }

    @GetMapping(params = "barcode")
    public ResponseEntity<Void> findByQuantityLessThan(@RequestParam Long barcode){
        this.stockService.deleteByBarcode(barcode);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/projection", params = "barcode")
    public ResponseEntity<List<Stock>> findByBarcodeWithProjection(@RequestParam Long barcode){
        return ResponseEntity.ok(this.stockService.findByBarcodeWithProjection(barcode));
    }
}
