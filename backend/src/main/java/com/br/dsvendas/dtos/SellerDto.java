package com.br.dsvendas.dtos;

import java.io.Serializable;

import com.br.dsvendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class SellerDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private String Name;

    public SellerDto(Seller entity) {
        this.Name = entity.getName();
    }
}
