package com.projeto.MyFinances.Application.Service;


import com.projeto.MyFinances.Domain.Entity.Categoria;
import com.projeto.MyFinances.Infrastructure.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public List<Categoria> mostrarCategorias(){
        return categoriaRepository.findAll();
    }
    public Categoria buscarCategoria(Long id){
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria salvarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public void deletarCategoria(Long id){
        categoriaRepository.deleteById(id);
    }
}
