package com.example.MyFinances.Infrastructure.Repository;

import com.example.MyFinances.Domain.Entity.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
