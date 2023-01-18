package com.cards.api.model;

import com.cards.api.DTO.CarDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class CarModel {
    public CarModel(CarDTO data){
        this.modelo = data.modelo();
        this.fabricante = data.fabricante();
        this.dataFabricacao = data.dataFabricacao();
        this.valor = data.valor();
        this.anoModelo = data.anoModelo();
    }
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 50, nullable = false )
    private String modelo;
    @Column(length = 50, nullable = false )
    private String fabricante;
    @Column(length = 50, nullable = false )
    private String dataFabricacao;
    @Column(nullable = false )
    private double valor;
    @Column( nullable = false )
    private int anoModelo;

}
