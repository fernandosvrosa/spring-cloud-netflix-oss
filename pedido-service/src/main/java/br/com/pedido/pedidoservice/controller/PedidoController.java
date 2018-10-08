package br.com.pedido.pedidoservice.controller;

import br.com.pedido.pedidoservice.domain.Pedido;
import br.com.pedido.pedidoservice.domain.Usuario;
import br.com.pedido.pedidoservice.integration.UsuarioIntegration;
import br.com.pedido.pedidoservice.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private UsuarioIntegration usuarioIntegration;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pedido> findById(@PathVariable("id") Long id){
        Pedido pedido = pedidoRepository.findById(id).get();
        Usuario usuario = usuarioIntegration.pessoaById(pedido.getUsuarioId());
        pedido.setUsuario(usuario);
        return ResponseEntity.ok(pedido);
    }

}
