package com.projeto.MyFinances.Infrastructure.Repository;

import com.projeto.MyFinances.Domain.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
