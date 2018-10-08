package br.com.pedido.pedidoservice.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@Entity(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    @Column(name = "sobre_nome")
    private String sobreNome;

    private String documento;

}
