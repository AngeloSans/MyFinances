package com.projeto.MyFinances.Infrastructure.Repository;

import com.projeto.MyFinances.Domain.Entity.Bills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillsRepository extends JpaRepository<Bills, Long> {
}
