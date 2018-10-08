package br.com.pedido.pedidoservice.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
@Entity(name = "produto")
public class Produto {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;

    private String descricao;

    private BigDecimal valor;


}
