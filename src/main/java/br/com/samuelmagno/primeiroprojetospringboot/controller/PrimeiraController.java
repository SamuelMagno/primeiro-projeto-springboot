package br.com.samuelmagno.primeiroprojetospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import javax.swing.text.html.parser.Entity;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;




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

    @PostMapping("metodoComBody")
    public String metodoComBody(@RequestBody Usuario usuario) {
        return "Metodo com body: " + usuario.username;
    }
    
    record Usuario(String username) {
    }

    @PostMapping("metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("name") String name) {
        return "Metodo com header: " + name;
    }

    @PostMapping("metodoComHeadersAll")
    public String metodoComHeadersAll(@RequestHeader Map<String, String> headers) {
        return "Metodo com header: " + headers.entrySet();
    }

    @GetMapping("/metodoResponseEntity")
    public ResponseEntity<Object> metodoResponseEntity() {
        return ResponseEntity.status(HttpStatus.OK).body("Mensagem");
    }

    @GetMapping("/metodoResponseEntityTwo/{id}")
    public ResponseEntity<Object> metodoResponseEntityTwo(@PathVariable Long id) {
        if (id > 5) {
            return ResponseEntity.status(HttpStatus.OK).body("Mensagem: Id " + id);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Mensagem Error");
        }
    }
    
}
