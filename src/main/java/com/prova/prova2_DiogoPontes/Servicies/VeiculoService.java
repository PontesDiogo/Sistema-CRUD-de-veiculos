package com.prova.prova2_DiogoPontes.Servicies;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prova.prova2_DiogoPontes.Entities.Veiculo;
import com.prova.prova2_DiogoPontes.Mappers.VeiculoMapper;
import com.prova.prova2_DiogoPontes.Repositories.VeiculoRepository;
import com.prova.prova2_DiogoPontes.dtos.VeiculoRequest;
import com.prova.prova2_DiogoPontes.dtos.VeiculoResponse;

import jakarta.persistence.EntityNotFoundException;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<VeiculoResponse> getAllVeiculo() {
        return repository.findAll().stream().map(v -> VeiculoMapper.toDto(v)).collect(Collectors.toList());
    }

    
    public void deleteVeiculo(long id){
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Veiculo not found");

        }
    } 

    public VeiculoResponse save (VeiculoRequest veiculo){
        Veiculo newVeiculo = repository.save(VeiculoMapper.toEntity(veiculo));
        return VeiculoMapper.toDto(newVeiculo);
    }

    public VeiculoResponse saveVeiculoSemValidacao(VeiculoRequest veiculo){
        Veiculo newVeiculo = repository.save(VeiculoMapper.toEntity(veiculo));
        return VeiculoMapper.toDto(newVeiculo);
    }

}
