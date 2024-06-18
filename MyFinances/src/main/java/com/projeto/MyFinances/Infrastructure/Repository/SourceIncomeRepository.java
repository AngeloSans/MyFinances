package com.projeto.MyFinances.Infrastructure.Repository;

import com.projeto.MyFinances.Domain.Entity.SourceIncome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceIncomeRepository extends JpaRepository<SourceIncome, Long> {
}
