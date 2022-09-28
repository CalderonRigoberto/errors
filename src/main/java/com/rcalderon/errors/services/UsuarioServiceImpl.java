package com.rcalderon.errors.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rcalderon.errors.models.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private List<Usuario> list;

    public UsuarioServiceImpl() {
        this.list = new ArrayList<>();
        this.list.add(new Usuario(1, "Rigo", "Calderon"));
        this.list.add(new Usuario(2, "Berto", "Calderon"));
        this.list.add(new Usuario(3, "De", "Calderon"));
        this.list.add(new Usuario(4, "Jesus", "Calderon"));

    }

    @Override
    public List<Usuario> getAll() throws Exception {
        return list;
    }

    @Override
    public Usuario getById(Integer id) {
        Usuario usuario = new Usuario();
        for (Usuario usuario2 : list) {
            if (usuario2.getId() == id) {
                usuario = usuario2;
            }
        }
        return usuario;
    }

}
