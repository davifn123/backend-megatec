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
        return produtoRepository.findAll();
    }

    public Optional<Produto> obterPorId(Integer id) {

        return produtoRepository.findById(id);

    }

    public Produto adicionar(Produto produto) {

        produto.setId(null);
        return produtoRepository.save(produto);

    }

    public void deletar(Integer id) {
        produtoRepository.deleteById(id);
    }

    public Produto alterar(Integer id, Produto produto) {

        // recebe id pela url
        produto.setId(id);
        return produtoRepository.save(produto);
    }

}
