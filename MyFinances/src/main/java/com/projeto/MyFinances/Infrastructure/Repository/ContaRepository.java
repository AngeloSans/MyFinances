package com.projeto.MyFinances.Infrastructure.Repository;


import com.projeto.MyFinances.Domain.Entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
}
