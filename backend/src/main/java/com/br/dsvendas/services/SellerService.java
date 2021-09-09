package com.br.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.br.dsvendas.dtos.SellerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDto> findAll() {
        var result = repository.findAll();
        return result.stream().map(x -> new SellerDto(x)).collect(Collectors.toList());
    }
}
