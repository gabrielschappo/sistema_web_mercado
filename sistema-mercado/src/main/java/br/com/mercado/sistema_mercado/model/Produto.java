package br.com.mercado.sistema_mercado.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    
    private String descricao;
    
    private String codigoBarras;
    
    private BigDecimal preco;
    
    private Integer quantidadeEstoque;
    
    private String categoria;
}