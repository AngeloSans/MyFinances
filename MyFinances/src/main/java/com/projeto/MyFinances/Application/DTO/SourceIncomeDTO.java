package com.projeto.MyFinances.Application.DTO;


import com.projeto.MyFinances.Domain.Entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SourceIncomeDTO {
    private Long id;
    private String sourceIncome;
    private double value;

}
