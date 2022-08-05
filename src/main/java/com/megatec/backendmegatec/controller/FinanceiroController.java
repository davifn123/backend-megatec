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

import com.megatec.backendmegatec.model.Financeiro;
import com.megatec.backendmegatec.services.FinanceiroService;

/**
 * Anotação Controller - informar para Spring que é uma
 * classe controller
 * Anotação GetMapping informar o verbo da ação, get = buscar.
 * Anotação RequestBody para transformar a requisição no objeto
 * Financeiro
 * Anotação PostMapping - informando para o Spring que é um Post
 * Anotação PathVariable - Pega a variavel que esta no caminho
 * para uso
 */

@RestController
@RequestMapping("/api/financeiro")
public class FinanceiroController {

    @Autowired
    private FinanceiroService financeiroService;

    @GetMapping
    public List<Financeiro> obterTodos() {

        return financeiroService.obterTodos();
    }

    @GetMapping("/{id}")
    public Optional<Financeiro> obterPorId(@PathVariable Integer id) {

        return financeiroService.obterPorId(id);
    }

    @PostMapping
    public Financeiro adicionar(@RequestBody Financeiro financeiro) {

        return financeiroService.adicionar(financeiro);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Integer id) {
        financeiroService.deletar(id);
        return "Financeiro com id: " + id + " Deletado com Sucesso";
    }

    @PutMapping("/{id}")
    public Financeiro alterar(@RequestBody Financeiro financeiro, @PathVariable Integer id) {
        return financeiroService.alterar(id, financeiro);
    }

}
