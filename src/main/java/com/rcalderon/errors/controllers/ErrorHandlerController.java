package com.rcalderon.errors.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Captura los lanzamientos de excepción
@ControllerAdvice
public class ErrorHandlerController {

    // Notación para lanzar por excepción
    @ExceptionHandler(ArithmeticException.class)
    public String aritmethicError(Exception ex, Model model) {
        model.addAttribute("error", "Error en tu division");
        return "error/arithmethic";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String formatEx(Exception ex, Model model) {
        model.addAttribute("error", "Error en tu division");
        return "error/formatex";
    }
}
