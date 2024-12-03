package com.prova.prova2_DiogoPontes.dtos;

public record VeiculoResponse(
    Long id,
    String placa,
    String marca,
    String modelo,
    String cor, 
    String ano
) {
    
}
