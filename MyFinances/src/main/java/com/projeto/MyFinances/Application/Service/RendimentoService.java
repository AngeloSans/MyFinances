package com.projeto.MyFinances.Application.Service;


import com.projeto.MyFinances.Domain.Entity.Rendimento;
import com.projeto.MyFinances.Infrastructure.Repository.RendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RendimentoService {

    @Autowired
    RendimentoRepository rendimentoRepository;


    public List<Rendimento> mostrarRendimento(){
        return rendimentoRepository.findAll();
    }

    public Rendimento buscarRendimento(Long id){
        return rendimentoRepository.findById(id).orElse(null);
    }
    public void deletarRendimento(Long id){
        rendimentoRepository.deleteById(id);
    }
    public Rendimento salvarRendimento(Rendimento rendimento){
        return rendimentoRepository.save(rendimento);
    }
}
