package br.com.pedido.pedidoservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.util.List;

@Data
@RequiredArgsConstructor
@Entity(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @Column(name = "usuario_id")
    private Long usuarioId;

    @Transient
    private Usuario usuario;

    @OneToMany
    @JoinTable(name = "produto_pedido",
    joinColumns = {@JoinColumn(name = "pedido_id", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "produto_id", referencedColumnName = "id")})
    private List<Produto> produtos;


}
