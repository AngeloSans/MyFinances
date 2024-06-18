package com.projeto.MyFinances.Domain.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Income")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double income;

    private double leftove;

    @OneToMany(mappedBy = "Income")
    private List<SourceIncome> sourceIncomes;
}
