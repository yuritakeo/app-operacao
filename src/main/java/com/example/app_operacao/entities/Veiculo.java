package com.example.app_operacao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "db_product")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class Veiculo implements Serializable {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String empresa;

}
