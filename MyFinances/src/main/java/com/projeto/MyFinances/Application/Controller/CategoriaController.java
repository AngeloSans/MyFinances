package com.projeto.MyFinances.Application.Controller;


import com.projeto.MyFinances.Application.Service.CategoriaService;
import com.projeto.MyFinances.Domain.Entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    //mostrarcategoria
    @GetMapping
    public List<Categoria> mostrarCategoria(){
        return categoriaService.mostrarCategorias();
    }
    //buscarcategoria
    @GetMapping("/{id}")
    public Categoria buscarCategoria(@PathVariable long id){
        return categoriaService.buscarCategoria(id);
    }

}
