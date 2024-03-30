package com.example.MyFinances.Application.Service;


import com.example.MyFinances.Domain.Entity.Categoria;
import com.example.MyFinances.Infrastructure.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria salvarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
