package com.example.app_operacao.services;

import com.example.app_operacao.entities.Veiculo;
import com.example.app_operacao.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> findAll(){
        return repository.findAll();
    }

    public Veiculo findById(Long id){
        Optional<Veiculo> obj = repository.findById(id);
        return obj.get();
    }

    public Veiculo insert(Veiculo veiculo){
        return repository.save(veiculo);
    }

}