package com.projeto.MyFinances.Application.Service;


import com.projeto.MyFinances.Domain.Entity.Usuario;
import com.projeto.MyFinances.Infrastructure.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //ver o usuario
    public Usuario buscarUsuario(Long id){
        return usuarioRepository.findById(id).orElse(null);
    }
    public List<Usuario> mostrarUsuarios(){
        return usuarioRepository.findAll();
    }

    //deletar
    public void deletarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }

}
