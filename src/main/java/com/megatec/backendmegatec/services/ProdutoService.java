package com.megatec.backendmegatec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megatec.backendmegatec.model.Produto;
import com.megatec.backendmegatec.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos() {
        // regra de negocio caso tenha
        return produtoRepository.obterTodos();
    }

    public Optional<Produto> obterPorId(Integer id) {

        return produtoRepository.obterPorId(id);

    }

    public Produto adicionar(Produto produto) {
        return produtoRepository.adicionar(produto);
    }

}
