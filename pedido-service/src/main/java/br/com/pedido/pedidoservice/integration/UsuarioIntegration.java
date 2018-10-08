package br.com.pedido.pedidoservice.integration;

import br.com.pedido.pedidoservice.domain.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("usuario-service")
public interface UsuarioIntegration {

    @RequestMapping(method = RequestMethod.GET, value = "/v1/usuarios/{id}")
    public Usuario pessoaById(@PathVariable("id") Long id);
}
