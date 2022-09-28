package com.rcalderon.errors.errors;

public class UsuarioNotFoundE extends RuntimeException {

    public UsuarioNotFoundE(String message) {
        super("Usuario con id no encontrado id = ".concat(message));
    }
}
