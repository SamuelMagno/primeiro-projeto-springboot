package br.com.samuelmagno.ioc_di;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/componente")
public class ComponenteController {
    
    @Autowired
    MeuComponente meuComponente;

    @GetMapping("/")
    public String chamandoComponente() {

        return meuComponente.chamar();
    }
}
