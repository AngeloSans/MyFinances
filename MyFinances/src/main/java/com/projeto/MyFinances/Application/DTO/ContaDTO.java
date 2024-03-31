package com.projeto.MyFinances.Application.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContaDTO {

    @NotBlank
    private String nome;

    private double saldo;
}
