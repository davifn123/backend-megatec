package com.megatec.backendmegatec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megatec.backendmegatec.model.Fornecedor;
import com.megatec.backendmegatec.repository.FornecedorRepository;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor adicionar(Fornecedor fornecedor) {

        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> obterTodos() {
        // regra de negocio caso tenha
        return fornecedorRepository.findAll();
    }

    // public Fornecedor obterPorIdFornecedor(Fornecedor fornecedor) {

    // return
    // fornecedorRepository.findByIdFornecedor(fornecedor.getCnpj_fornecedor());

    // }

    public Fornecedor obterPorCnpj(String cnpj_fornecedor) {

        return fornecedorRepository.findByIdCnpj(cnpj_fornecedor);

    }

    public Fornecedor obterPorNomeFornecedor(String nome_fornecedor) {

        return fornecedorRepository.findByNomeFornecedor(nome_fornecedor);

    }

    public void deletar(String cnpj_fornecedor) {
        fornecedorRepository.deleteById(cnpj_fornecedor);
    }

    public Fornecedor alterar(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

}
