package br.com.usuario.usuarioservice.repository;

import br.com.usuario.usuarioservice.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
