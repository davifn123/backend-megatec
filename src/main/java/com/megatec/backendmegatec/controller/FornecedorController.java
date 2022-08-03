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

import com.megatec.backendmegatec.model.Fornecedor;
import com.megatec.backendmegatec.services.FornecedorService;

@RestController
@RequestMapping("/api/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping
    public List<Fornecedor> obterTodos() {

        return fornecedorService.obterTodos();
    }

    @GetMapping("/{cnpj}")
    public Optional<Fornecedor> obterPorId(@PathVariable String cnpj_fornecedor) {

        return fornecedorService.obterPorId(cnpj_fornecedor);
    }

    @PostMapping
    public Fornecedor adicionar(@RequestBody Fornecedor fornecedor) {

        return fornecedorService.adicionar(fornecedor);
    }

    @DeleteMapping("/{cnpj}")
    public String deletar(@PathVariable String cnpj_fornecedor) {
        fornecedorService.deletar(cnpj_fornecedor);
        return "Fornecedor com id: " + cnpj_fornecedor + " Deletado com Sucesso";
    }

    @PutMapping("/{cnpj}")
    public Fornecedor alterar(@RequestBody Fornecedor fornecedor, @PathVariable String cnpj_fornecedor) {
        return fornecedorService.alterar(cnpj_fornecedor, fornecedor);
    }

}
