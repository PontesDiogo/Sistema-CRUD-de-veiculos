package com.prova.prova2_DiogoPontes.Mappers;

import com.prova.prova2_DiogoPontes.Entities.Veiculo;
import com.prova.prova2_DiogoPontes.dtos.VeiculoRequest;
import com.prova.prova2_DiogoPontes.dtos.VeiculoResponse;

import jakarta.persistence.EntityNotFoundException;

public class VeiculoMapper {

    public static Veiculo toEntity(VeiculoRequest veiculo2) {
        Veiculo veiculo = new Veiculo();
        veiculo.setAno(veiculo2.ano());
        veiculo.setCor(veiculo2.cor());
        veiculo.setMarca(veiculo2.marca());
        veiculo.setModelo(veiculo2.modelo());
        veiculo.setPlaca(veiculo2.placa());

        return veiculo;

    }

    public static VeiculoResponse toDto(Veiculo newVeiculo) {

        Veiculo veiculo = newVeiculo;

        return new VeiculoResponse(
                newVeiculo.getId(),
                newVeiculo.getPlaca(),
                newVeiculo.getMarca(),
                newVeiculo.getModelo(),
                newVeiculo.getCor(),
                newVeiculo.getAno());

    }
}
