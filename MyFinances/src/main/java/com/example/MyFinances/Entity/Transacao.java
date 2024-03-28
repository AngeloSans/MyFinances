package com.example.MyFinances.Entity;


import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Table(name = "Transação")
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Descrição")
    private String descricao;

    @Column(name = "Quantidade")
    private BigDecimal quantidade;

    @Enumerated(EnumType.STRING)
    private EnumType tipo;

}
