package com.projeto.MyFinances.Infrastructure.Repository;

import com.projeto.MyFinances.Domain.Entity.Spends;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpendsRepository extends JpaRepository<Spends, Long> {
}
