package com.projeto.MyFinances.Application.Service;


import com.projeto.MyFinances.Infrastructure.Repository.SourceIncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SourceIncomeService {

    @Autowired
    SourceIncomeRepository sourceIncomeRepository;

    public SourceIncome getByid(Long id){
        return sourceIncomeRepository.findBy(id);
    }

}
