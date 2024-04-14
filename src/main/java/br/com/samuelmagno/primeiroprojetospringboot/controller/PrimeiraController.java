package br.com.samuelmagno.primeiroprojetospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/primeiracontroller")
public class PrimeiraController {
    @GetMapping("/primeirometodo")
    public String primeiroMetodo() {
        return "Primeira API Rest com Spring";
    }
}
