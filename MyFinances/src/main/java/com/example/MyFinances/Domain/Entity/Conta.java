package com.example.MyFinances.Domain.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "saldo")
    private double saldo;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
