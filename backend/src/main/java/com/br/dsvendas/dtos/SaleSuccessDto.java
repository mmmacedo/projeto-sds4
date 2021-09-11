package com.br.dsvendas.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class SaleSuccessDto {

    private String sellerName;
    private Long visited;
    private Long deals;

}
