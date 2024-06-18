package com.projeto.MyFinances.Application.Service;


import com.projeto.MyFinances.Infrastructure.Repository.SourceIncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SourceIncomeController {

    @Autowired
    SourceIncomeRepository sourceIncomeRepository;
}
