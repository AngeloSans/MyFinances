package com.projeto.MyFinances.Application.Controller;


import com.projeto.MyFinances.Domain.Entity.Transacao;
import com.projeto.MyFinances.Application.Service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/transacao")
public class TransacaoController {

    @Autowired
    TransacaoService transacaoService;

    @GetMapping
    public List<Transacao> mostrarTransacoes(){
        return transacaoService.mostrarTransacoes();
    }
    @GetMapping("/{id}")
    public Transacao buscarTransacao(@PathVariable Long id){
        return transacaoService.buscarTransacao(id);

    }
    @PostMapping
    public Transacao criarTransacao(@RequestBody Transacao transacao){
        return transacaoService.criarTransacao(transacao);
    }
    @DeleteMapping("/{id}")
    public void deletarTransacao(@PathVariable Long id){
        transacaoService.deletarTransacao(id);
    }
}
