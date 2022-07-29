package com.megatec.backendmegatec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.megatec.backendmegatec.model.Produto;

@Repository
public class ProdutoRepository {

    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultId = 0;

    /**
     * Retorna lista de produtos
     * 
     * @return lista de protudos
     */
    public List<Produto> obterTodos() {
        return produtos;
    }

    /**
     * Retornar produto por id
     * 
     * @return id produto
     */
    public Optional<Produto> obterPorId(Integer id) {
        return produtos.obterPorId(id);
    }

}
