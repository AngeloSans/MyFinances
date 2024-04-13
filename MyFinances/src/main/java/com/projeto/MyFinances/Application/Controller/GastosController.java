package com.projeto.MyFinances.Application.Controller;


import com.projeto.MyFinances.Application.Service.GastosService;
import com.projeto.MyFinances.Domain.Entity.Gastos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class GastosController {

    @Autowired
    GastosService categoriaService;

    //mostrarcategoria
    @GetMapping
    public List<Gastos> mostrarCategoria(){
        return categoriaService.mostrarCategorias();
    }
    //buscarcategoria
    @GetMapping("/{id}")
    public Gastos buscarCategoria(@PathVariable long id){
        return categoriaService.buscarCategoria(id);
    }

}
