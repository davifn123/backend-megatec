package com.megatec.backendmegatec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megatec.backendmegatec.model.Produto;
import com.megatec.backendmegatec.services.ProdutoService;

/**
 * Anotação Controller - informar para Spring que é uma
 * classe controller
 * Anotação GetMapping informar o verbo da ação, get = buscar.
 * Anotação RequestBody para transformar a requisição no objeto
 * Produto
 * Anotação PostMapping - informando para o Spring que é um Post
 * Anotação PathVariable - Pega a variavel que esta no caminho
 * para uso
 */

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> obterTodos() {

        return produtoService.obterTodos();
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterPorId(@PathVariable Integer id) {

        return produtoService.obterPorId(id);
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto) {

        return produtoService.adicionar(produto);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Integer id) {
        produtoService.deletar(id);
        return "Produto com id: " + id + " Deletado com Sucesso";
    }

    @PutMapping("{id}")
    public Produto alterar(@RequestBody Produto produto, @PathVariable Integer id) {
        return produtoService.alterar(id, produto);
    }

}
