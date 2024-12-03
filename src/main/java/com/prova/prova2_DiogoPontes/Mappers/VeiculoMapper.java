package com.prova.prova2_DiogoPontes.Mappers;

import com.prova.prova2_DiogoPontes.Entities.Veiculo;
import com.prova.prova2_DiogoPontes.dtos.VeiculoRequest;
import com.prova.prova2_DiogoPontes.dtos.VeiculoResponse;

import jakarta.persistence.EntityNotFoundException;

public class VeiculoMapper {
    public static VeiculoResponse toDto(Veiculo veiculo) {
        return new VeiculoResponse(
                veiculo.getId(),
                veiculo.getPlaca(),
                veiculo.getMarca(),
                veiculo.getModelo(),
                veiculo.getAno(),
                veiculo.getCor());
    }

    public static Veiculo toEntity(VeiculoRequest veiculoRequest) {
        Veiculo veiculo = new Veiculo();
        veiculo.setAno(veiculoRequest.ano());
        veiculo.setCor(veiculoRequest.cor());
        veiculo.setMarca(veiculoRequest.marca());
        veiculo.setModelo(veiculoRequest.modelo());
        veiculo.setPlaca(veiculoRequest.placa());

        return veiculo;

    }

}
