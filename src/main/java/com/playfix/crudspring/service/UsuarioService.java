package com.playfix.crudspring.service;

import com.playfix.crudspring.model.Usuario;
import com.playfix.crudspring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Obtener todos los usuarios
    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    // Guardar nuevo usuario o actualizar existente
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Buscar por ID
    public Optional<Usuario> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    // Eliminar por ID
    public void eliminarPorId(Long id) {
        usuarioRepository.deleteById(id);
    }

}
