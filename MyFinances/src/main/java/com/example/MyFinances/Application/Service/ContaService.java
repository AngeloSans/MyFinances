package com.example.MyFinances.Application.Service;


import com.example.MyFinances.Domain.Entity.Conta;
import com.example.MyFinances.Infrastructure.Repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    ContaRepository contaRepository;

    public Conta salvarConta(Conta conta){
        return contaRepository.save(conta);
    }
}
