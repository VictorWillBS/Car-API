package com.cards.api.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.util.Date;

public record CarDTO(
        @NotBlank String modelo,
        @NotBlank
        String fabricante,
        @Past
        Date  dataFabricacao,
        double valor,
        @Past
        Date anoModelo) {
}
