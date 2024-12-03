package com.prova.prova2_DiogoPontes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.prova2_DiogoPontes.Entities.Veiculo;
import com.prova.prova2_DiogoPontes.Servicies.VeiculoService;
import com.prova.prova2_DiogoPontes.dtos.VeiculoRequest;
import com.prova.prova2_DiogoPontes.dtos.VeiculoResponse;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("veiculos")
public class VeiculoController {
    @Autowired
    
    public VeiculoService service;


    @GetMapping
    public ResponseEntity<List<VeiculoResponse>> getVeiculos() {
        return ResponseEntity.ok(service.getAllVeiculo());
    }
    

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteCity(@PathVariable long id) {
        service.deleteVeiculo(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping()
    public ResponseEntity<VeiculoResponse> saveVeiculo(@Validated @RequestBody VeiculoRequest veiculo) {
        VeiculoResponse newVeiculo = service.save(veiculo);
        
        return ResponseEntity.created(null).body(newVeiculo);
    }


    @PostMapping()
    public ResponseEntity<VeiculoResponse> saveVeiculoSemValidacao(@RequestBody VeiculoRequest veiculo){
        VeiculoResponse newVeiculo = service.save(veiculo);
        return ResponseEntity.created(null).body(newVeiculo);
    }
    

}
