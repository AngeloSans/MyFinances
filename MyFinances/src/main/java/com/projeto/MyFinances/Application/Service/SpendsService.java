package com.projeto.MyFinances.Application.Service;


import com.projeto.MyFinances.Application.DTO.SpendsDTO;
import com.projeto.MyFinances.Domain.Entity.Spends;
import com.projeto.MyFinances.Infrastructure.Repository.SpendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpendsService {

    @Autowired
    SpendsRepository spendsRepository;

    public Spends saveSpend(Spends spends){
        return spendsRepository.save(spends);
    }
}
