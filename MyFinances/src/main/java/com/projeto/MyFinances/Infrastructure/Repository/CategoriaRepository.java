package com.projeto.MyFinances.Infrastructure.Repository;


import com.projeto.MyFinances.Domain.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
