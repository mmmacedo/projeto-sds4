package com.br.dsvendas.repositories;

import com.br.dsvendas.dtos.SaleSuccessDto;
import com.br.dsvendas.dtos.SaleSumDto;
import com.br.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.br.dsvendas.dtos.SaleSumDto(obj.seller.Name, sum(obj.amount) )from Sale As obj GROUP BY obj.seller")
    List<SaleSumDto> amountGroupedBySeller();

    @Query("SELECT new com.br.dsvendas.dtos.SaleSuccessDto(obj.seller.Name, sum(obj.visited), sum(obj.deals) )from Sale As obj GROUP BY obj.seller")
    List<SaleSuccessDto> saleSuccessGroupedBySeller();
}
