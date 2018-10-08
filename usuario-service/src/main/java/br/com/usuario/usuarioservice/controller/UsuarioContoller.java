package br.com.usuario.usuarioservice.controller;

import br.com.usuario.usuarioservice.domain.Usuario;
import br.com.usuario.usuarioservice.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioContoller {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Usuario> findById(@PathVariable("id") Long id) {
        Usuario usuario = usuarioRepository.findById(id).get();
        return ResponseEntity.ok(usuario);
    }

}
