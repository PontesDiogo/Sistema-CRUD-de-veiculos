package com.prova.prova2_DiogoPontes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.prova2_DiogoPontes.Entities.Veiculo;
import com.prova.prova2_DiogoPontes.Servicies.VeiculoService;
import com.prova.prova2_DiogoPontes.dtos.VeiculoResponse;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("veiculos")
public class VeiculoController {
    @Autowired
    
    public VeiculoService service;


    @GetMapping
    public ResponseEntity<List<VeiculoResponse>> getVeiculos() {
        return ResponseEntity.ok(service.getAllVeiculo());
    }
    


}
