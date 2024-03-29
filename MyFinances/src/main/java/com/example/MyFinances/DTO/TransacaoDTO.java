package com.example.MyFinances.DTO;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransacaoDTO {
    private String descricao;
    private BigDecimal quantidade;
}
