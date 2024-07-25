package com.example.app_operacao.config;

import com.example.app_operacao.entities.Veiculo;
import com.example.app_operacao.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner {

    @Autowired
    private VeiculoRepository repository;

    @Override
    public void run(String... args) throws Exception {
        salvar_Teste();
    }

    private void salvar_Teste() {
        Veiculo veiculo000 = new Veiculo(null, 12000L,"Praia Sol");
        Veiculo veiculo001 = new Veiculo(null,12001L,"Praia Sol");
        Veiculo veiculo002 = new Veiculo(null,12002L,"Praia Sol");
        Veiculo veiculo003 = new Veiculo(null,12003L,"Praia Sol");
        Veiculo veiculo004 = new Veiculo(null,12004L,"Praia Sol");
        Veiculo veiculo005 = new Veiculo(null,12005L,"Praia Sol");
        Veiculo veiculo006 = new Veiculo(null,12006L,"Praia Sol");
        Veiculo veiculo007 = new Veiculo(null,12007L,"Praia Sol");
        Veiculo veiculo008 = new Veiculo(null,12008L,"Praia Sol");
        Veiculo veiculo009 = new Veiculo(null,12009L,"Praia Sol");
        Veiculo veiculo010 = new Veiculo(null,12010L,"Praia Sol");
        Veiculo veiculo011 = new Veiculo(null,12011L,"Praia Sol");
        Veiculo veiculo012 = new Veiculo(null,12012L,"Praia Sol");
        Veiculo veiculo013 = new Veiculo(null,12013L,"Praia Sol");
        repository.saveAll(Arrays.asList(
                veiculo000,
                veiculo001,
                veiculo002,
                veiculo003,
                veiculo004,
                veiculo005,
                veiculo006,
                veiculo007,
                veiculo008,
                veiculo009,
                veiculo010,
                veiculo011,
                veiculo012,
                veiculo013
        ));
    }

}
