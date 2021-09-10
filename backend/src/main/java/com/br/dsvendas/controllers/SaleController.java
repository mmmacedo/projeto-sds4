package com.br.dsvendas.controllers;

import com.br.dsvendas.dtos.SaleDto;
import com.br.dsvendas.dtos.SaleSuccessDto;
import com.br.dsvendas.dtos.SaleSumDto;
import com.br.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable) {
        var list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "amount-by-seller")
    public ResponseEntity<List<SaleSumDto>> amountGroupedBySeller() {
        var list = service.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "success-by-seller")
    public ResponseEntity<List<SaleSuccessDto>> saleSuccessGroupedBySeller() {
        var list = service.saleSuccessGroupedBySeller();
        return ResponseEntity.ok(list);
    }
}
