package com.br.dsvendas.dtos;

import com.br.dsvendas.entities.Sale;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleDto {

    private int visited;
    private int deals;
    private double amount;
    private LocalDate date;
    private SellerDto seller;

    public SaleDto(Sale entity) {
        this.visited = entity.getVisited();
        this.deals = entity.getDeals();
        this.amount = entity.getAmount();
        this.date = entity.getDate();
        this.seller = new SellerDto(entity.getSeller());
    }
}
