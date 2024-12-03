package com.prova.prova2_DiogoPontes.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record VeiculoRequest(

    @NotBlank(message = "A placa não pode estar em branco")
    @Size(min = 7, message = "A placa tem que ter no mínimo 7 caracteres")
    String placa,
    @NotBlank(message = "A marca não pode estar em branco")
    String marca,
    @NotBlank(message = "O modelo não pode estar em branco")
    String modelo,
    @NotBlank(message = "A cor não pode estar em branco")
    String cor, 
    @NotBlank(message = "O ano não pode estar em branco")
    String ano
) {

} 
