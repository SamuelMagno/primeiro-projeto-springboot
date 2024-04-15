package br.com.samuelmagno.primeiroprojetospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/primeiracontroller")
public class PrimeiraController {
    @GetMapping("/primeirometodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "Primeira API Rest com Spring. Param ID: " + id;
    }

    @GetMapping("/metodoQueryParam")
    public String metodoQueryParam(@RequestParam String id) {
        return "Param é " + id;
    }

    @GetMapping("/metodoQueryParamAll")
    public String metodoQueryParamAll(@RequestParam Map<String, String> allParams) {
        return "Param é " + allParams.entrySet();
    }
    
}
