package com.projeto.MyFinances.Application.Controller;


import com.projeto.MyFinances.Application.Service.UsuarioService;
import com.projeto.MyFinances.Domain.Entity.Usuario;
import com.projeto.MyFinances.Infrastructure.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> mostrarUsuarios(){
        return usuarioService.mostrarUsuarios();
    }
    @GetMapping("/{id}")
    public Usuario buscarUsuario(@PathVariable Long id){
        return usuarioService.buscarUsuario(id);
    }
    @PostMapping
    public Usuario salvarUsuario(@RequestBody Usuario usuario){
        return usuarioService.salvarUsuario(usuario);
    }

}
