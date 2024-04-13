package com.projeto.MyFinances.Application.Service;


import com.projeto.MyFinances.Domain.Entity.Gastos;
import com.projeto.MyFinances.Infrastructure.Repository.GastosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastosService {

    @Autowired
    GastosRepository gastosRepository;

    public List<Gastos> mostrarCategorias(){
        return gastosRepository.findAll();
    }
    public Gastos buscarCategoria(Long id){
        return gastosRepository.findById(id).orElse(null);
    }

    public Gastos salvarCategoria(Gastos gastos){
        return gastosRepository.save(gastos);
    }

    public void deletarCategoria(Long id){
        gastosRepository.deleteById(id);
    }
}
