package com.br.dsvendas.controllers;

import com.br.dsvendas.dtos.SellerDto;
import com.br.dsvendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    private SellerService service;

    @GetMapping
    public ResponseEntity<List<SellerDto>> findAll() {
        var list = service.findAll();
        return ResponseEntity.ok(list);
    }
}
