package com.projeto.MyFinances.Infrastructure.Repository;


import com.projeto.MyFinances.Domain.Entity.Rendimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendimentoRepository extends JpaRepository<Rendimento, Long> {
}
