package com.projeto.MyFinances.Application.Service;


import com.projeto.MyFinances.Domain.Entity.Conta;
import com.projeto.MyFinances.Infrastructure.Repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    ContaRepository contaRepository;

    //salvar conta
    public Conta salvarConta(Conta conta){
        return contaRepository.save(conta);
    }

    //listarcontas
    public List<Conta> listarContas(){
        return contaRepository.findAll();
    }
    //deletar conta
    public void deletarConta(long id){
        contaRepository.deleteById(id);
    }

}
