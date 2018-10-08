package br.com.pedido.pedidoservice.repository;

import br.com.pedido.pedidoservice.domain.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
