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

import com.megatec.backendmegatec.model.Vendas;
import com.megatec.backendmegatec.services.VendasService;

/**
 * Anotação Controller - informar para Spring que é uma
 * classe controller
 * Anotação GetMapping informar o verbo da ação, get = buscar.
 * Anotação RequestBody para transformar a requisição no objeto
 * Vendas
 * Anotação PostMapping - informando para o Spring que é um Post
 * Anotação PathVariable - Pega a variavel que esta no caminho
 * para uso
 */

@RestController
@RequestMapping("/api/vendas")
public class VendasController {

    @Autowired
    private VendasService vendasService;

    @GetMapping
    public List<Vendas> obterTodos() {

        return vendasService.obterTodos();
    }

    @GetMapping("/{id}")
    public Optional<Vendas> obterPorId(@PathVariable Integer id) {

        return vendasService.obterPorId(id);
    }

    @PostMapping
    public Vendas adicionar(@RequestBody Vendas vendas) {

        return vendasService.adicionar(vendas);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Integer id) {
        vendasService.deletar(id);
        return "Vendas com id: " + id + " Deletado com Sucesso";
    }

    @PutMapping("/{id}")
    public Vendas alterar(@RequestBody Vendas vendas, @PathVariable Integer id) {
        return vendasService.alterar(id, vendas);
    }

}
