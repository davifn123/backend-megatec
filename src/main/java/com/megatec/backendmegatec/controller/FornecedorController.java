package com.megatec.backendmegatec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megatec.backendmegatec.model.Fornecedor;
import com.megatec.backendmegatec.services.FornecedorService;
import com.megatec.classesid.FornecedorId;

@RestController
@RequestMapping("/api/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping
    public List<Fornecedor> obterTodos() {

        return fornecedorService.obterTodos();
    }

    @GetMapping
    public Fornecedor obterPorIdFornecedor(@RequestBody FornecedorId fornecedorId) {

        return fornecedorService.obterPorIdFornecedor(fornecedorId);
    }

    @GetMapping
    public Fornecedor obterPorCnpj(@RequestBody Fornecedor cnpj_fornecedor) {
        return fornecedorService.obterPorCnpj(cnpj_fornecedor);
    }

    @PostMapping
    public Fornecedor adicionar(@RequestBody Fornecedor fornecedor) {

        return fornecedorService.adicionar(fornecedor);
    }

    @DeleteMapping("/{deletar}")
    public String deletar(@RequestBody FornecedorId fornecedorId) {
        fornecedorService.deletar(fornecedorId);
        return "Fornecedor com id: " + fornecedorId + " Deletado com Sucesso";
    }

    @PutMapping
    public Fornecedor alterar(@RequestBody Fornecedor fornecedor) {
        return fornecedorService.alterar(fornecedor);
    }

}
