package com.projeto.MyFinances.Application.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Spends {
    private Long id;
    private String spendName;
    private double spendValue;
}
