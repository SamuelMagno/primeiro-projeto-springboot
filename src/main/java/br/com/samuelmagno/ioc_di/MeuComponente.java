package br.com.samuelmagno.ioc_di;

import org.springframework.stereotype.Component;

@Component
public class MeuComponente {

    public String chamar() {
        return "chamando componente";
    }
}
