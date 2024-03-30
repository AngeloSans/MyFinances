package com.example.MyFinances.Domain.Entity;


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

    @ManyToOne
    @JoinColumn(name = "Usuario_id")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
}
