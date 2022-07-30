package com.megatec.backendmegatec.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
     * Optional para nao retornar erro caso retorne
     * Retornar produto por id
     * 
     * @param id chave do prod
     * @return um produto caso seja encontrado
     */
    public Optional<Produto> obterPorId(Integer id) {
        return produtos.stream().filter(produto -> produto.getId() == id).findFirst();

    }

    /**
     * 
     * 
     */
    public Produto adicionar(Produto produto) {
        ultId++;
        produto.setId(ultId);
        produtos.add(produto);

        return produto;
    }

    /**
     * 
     * 
     */
    public void deletar(Integer id) {
        produtos.removeIf(produto -> produto.getId() == id);

    }

    public Produto alterar(Produto produto) {

        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());

        if (produtoEncontrado.isEmpty()) {
            throw new InputMismatchException("produto não encontrado");
        }

        deletar(produto.getId());

        produtos.add(produto);

        return produto;
    }

}
