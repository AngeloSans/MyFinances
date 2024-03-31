package com.projeto.MyFinances.Infrastructure.Repository;



import com.projeto.MyFinances.Domain.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //verifica se ele existe
    boolean existsById(Long id);
}
