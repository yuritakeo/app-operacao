package com.example.app_operacao.resources;


import com.example.app_operacao.entities.Veiculo;
import com.example.app_operacao.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {

    @Autowired
    private VeiculoService service;

    @GetMapping
    public ResponseEntity<List<Veiculo>> findAll(){
        List<Veiculo> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping()
    public ResponseEntity<Veiculo> insert(@RequestBody Veiculo newVeiculo){
        System.out.println("o corpo é " + newVeiculo);
        Veiculo veiculo = service.insert(newVeiculo);
        return ResponseEntity.ok().body(veiculo);
    }

}
