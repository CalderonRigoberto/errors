package com.rcalderon.errors.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rcalderon.errors.errors.UsuarioNotFoundE;
import com.rcalderon.errors.models.Usuario;
import com.rcalderon.errors.services.UsuarioService;

// Por defecto cuando creas en templates paginas de error
// el servidor las interpreta para ser mostradas,
// deben seguir un patrón nombre de  archivo correspondiente 
// al estatus del error
@Controller
public class ErrorController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/index")
    public String index() {
        // Integer val = 100 / 0;
        Integer val = Integer.parseInt("10x");
        return "index";
    }

    @GetMapping("/usuario/{id}")
    public String usuarioId(@PathVariable Integer id, Model model) {
        Usuario usuario = usuarioService.getById(id);
        if (usuario.getNombre() == null) {
            throw new UsuarioNotFoundE(id.toString());
        }
        model.addAttribute("usuario", usuario);
        return "ver";
    }
}
