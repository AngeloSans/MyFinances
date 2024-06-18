package com.projeto.MyFinances.Infrastructure.Repository;

import com.projeto.MyFinances.Domain.Entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
}
