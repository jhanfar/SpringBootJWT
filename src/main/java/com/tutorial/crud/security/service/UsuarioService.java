package com.tutorial.crud.security.service;


import com.tutorial.crud.security.Repository.UsuarioRepository;
import com.tutorial.crud.security.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario (String nombreUsuario){
        return  usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail (String email){
        return  usuarioRepository.existsByEmail(email);
    }

    public void save (Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
