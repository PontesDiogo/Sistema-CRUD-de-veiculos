package com.prova.prova2_DiogoPontes.Mappers;

import com.prova.prova2_DiogoPontes.Entities.Veiculo;
import com.prova.prova2_DiogoPontes.dtos.VeiculoRequest;
import com.prova.prova2_DiogoPontes.dtos.VeiculoResponse;


public class VeiculoMapper {

    public static Veiculo toEntity(VeiculoRequest veiculoRequest) {
        Veiculo veiculo = new Veiculo();
        veiculo.setAno(veiculoRequest.ano());
        veiculo.setCor(veiculoRequest.cor());
        veiculo.setMarca(veiculoRequest.marca());
        veiculo.setModelo(veiculoRequest.modelo());
        veiculo.setPlaca(veiculoRequest.placa());

        return veiculo;

    }

    public static VeiculoResponse toDto(Veiculo newVeiculo) {


        return new VeiculoResponse(
                newVeiculo.getId(),
                newVeiculo.getPlaca(),
                newVeiculo.getMarca(),
                newVeiculo.getModelo(),
                newVeiculo.getCor(),
                newVeiculo.getAno());

    }
}
