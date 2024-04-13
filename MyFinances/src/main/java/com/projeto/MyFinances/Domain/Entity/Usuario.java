package com.projeto.MyFinances.Domain.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "salario")
    private double salario;

    @Column(name = "quantideGasta")
    private double quantidadeGasta;

    @Column(name = "valorSobrado")
    private double valorRestante;

    @OneToMany(mappedBy = "usuario")
    private List<Conta> conta = new ArrayList<>();


}
