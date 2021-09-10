package com.br.dsvendas.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SaleSumDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private String sellerName;
    private Double sum;
}
