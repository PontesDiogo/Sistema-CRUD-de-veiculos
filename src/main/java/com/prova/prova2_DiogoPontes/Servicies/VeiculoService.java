package com.prova.prova2_DiogoPontes.Servicies;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prova.prova2_DiogoPontes.Mappers.VeiculoMapper;
import com.prova.prova2_DiogoPontes.Repositories.VeiculoRepository;
import com.prova.prova2_DiogoPontes.dtos.VeiculoResponse;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<VeiculoResponse> getAllVeiculo() {
        return repository.findAll().stream().map(v -> VeiculoMapper.toDto(v)).collect(Collectors.toList());
    }

}
