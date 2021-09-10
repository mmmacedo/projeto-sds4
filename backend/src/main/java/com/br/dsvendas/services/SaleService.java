package com.br.dsvendas.services;

import com.br.dsvendas.dtos.SaleDto;
import com.br.dsvendas.repositories.SaleRepository;
import com.br.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;
    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDto> findAll(Pageable pageable) {
        sellerRepository.findAll();
        var result = repository.findAll(pageable);
        return result.map(x -> new SaleDto(x));
    }
}
