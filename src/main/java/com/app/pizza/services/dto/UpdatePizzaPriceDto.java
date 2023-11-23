package com.platzi.pizza.services.dto;

import lombok.Data;

@Data
public class UpdatePizzaPriceDto {

    private int pizzaId;
    private double newPrice;

}
