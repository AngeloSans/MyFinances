package com.projeto.MyFinances.Domain.Entity;


import jakarta.persistence.*;

@Entity
public class Rendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeRendimento")
    private String nomeRendimento;

    @Column(name = "Rendimento")
    private Double rendimento;

}
