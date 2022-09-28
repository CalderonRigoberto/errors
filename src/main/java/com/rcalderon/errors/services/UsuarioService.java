package com.rcalderon.errors.services;

import java.util.List;

import com.rcalderon.errors.models.Usuario;

public interface UsuarioService {

    List<Usuario> getAll() throws Exception;

    Usuario getById(Integer id);
}
