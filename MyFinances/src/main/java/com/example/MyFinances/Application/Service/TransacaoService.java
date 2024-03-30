package com.example.MyFinances.Application.Service;


import com.example.MyFinances.Domain.Entity.Transacao;
import com.example.MyFinances.Infrastructure.Repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {

    @Autowired
    TransacaoRepository transacaoRepository;

    //create
    public Transacao criarTransacao(Transacao transacao){
        return transacaoRepository.save(transacao);
    }
    //read
    public Transacao buscarTransacao(Long id){
        return transacaoRepository.findById(id).orElse(null);
    }

    //update
    public List<Transacao> mostrarTransacoes(){
        return transacaoRepository.findAll();
    }
    //delete
    public void deletarTransacao(Long id){
        transacaoRepository.deleteById(id);
    }
}
