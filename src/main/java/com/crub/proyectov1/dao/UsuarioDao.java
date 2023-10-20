package com.crub.proyectov1.dao;

import com.crub.proyectov1.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuario();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    boolean verificarCredenciales(Usuario usuario);
}
