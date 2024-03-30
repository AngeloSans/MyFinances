package com.example.MyFinances.Domain.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "Transacao_id")
    private Transacao transacao;


}
