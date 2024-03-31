package com.projeto.MyFinances.Application.Controller;


import com.projeto.MyFinances.Application.Service.ContaService;
import com.projeto.MyFinances.Domain.Entity.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/conta")
public class ContaController {

    @Autowired
    ContaService contaService;

    @GetMapping
    public List<Conta> listarContas(){
        return contaService.listarContas();
    }

}
