package com.larionov.epam.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
    private Long article;
    private Long idBrand;
    private Long idType;
    private Long idCategory;
    private Long idSupplier;
    private BigDecimal price;

    @Override
    public String toString() {
        return "Product{" +
                "article=" + article +
                ", idBrand=" + idBrand +
                ", idType=" + idType +
                ", idCategory=" + idCategory +
                ", idSupplier=" + idSupplier +
                '}';
    }

}
