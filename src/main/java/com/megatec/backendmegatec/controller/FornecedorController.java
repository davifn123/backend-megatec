package com.megatec.backendmegatec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    @CrossOrigin(origins = "*")
    @GetMapping("/listarTodosFornecedores")
    public List<Fornecedor> obterTodos() {

        return fornecedorService.obterTodos();
    }

    // @GetMapping("/{cnpj}")
    // public Fornecedor obterPorIdFornecedor(@RequestBody Fornecedor fornecedor) {

    // return fornecedorService.obterPorIdFornecedor(fornecedor);
    // }

    @CrossOrigin(origins = "*")
    @GetMapping("/{cnpj_fornecedor}")
    public Fornecedor obterPorCnpj(@PathVariable String cnpj_fornecedor) {
        return fornecedorService.obterPorCnpj(cnpj_fornecedor);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/nome/{nome_fornecedor}")
    public Fornecedor obterPorNomeFornecedor(@PathVariable String nome_fornecedor) {

        return fornecedorService.obterPorNomeFornecedor(nome_fornecedor);

    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public Fornecedor adicionar(@RequestBody Fornecedor fornecedor) {

        return fornecedorService.adicionar(fornecedor);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{cnpj_fornecedor}")
    public String deletar(@PathVariable String cnpj_fornecedor) {
        fornecedorService.deletar(cnpj_fornecedor);
        return "Fornecedor com cnpj: " + cnpj_fornecedor + " Deletado com Sucesso";
    }

    @CrossOrigin(origins = "*")
    @PutMapping("/{cnpj_fornecedor}")
    public Fornecedor alterar(@RequestBody Fornecedor fornecedor, @PathVariable String cnpj_fornecedor) {
        return fornecedorService.alterar(fornecedor);
    }

}
