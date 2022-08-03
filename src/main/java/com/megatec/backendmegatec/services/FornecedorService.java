package com.megatec.backendmegatec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megatec.backendmegatec.model.Fornecedor;
import com.megatec.backendmegatec.repository.FornecedorRepository;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<Fornecedor> obterTodos() {
        // regra de negocio caso tenha
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> obterPorId(String cnpj_fornecedor) {

        return fornecedorRepository.findById(cnpj_fornecedor);

    }

    public Fornecedor adicionar(Fornecedor fornecedor) {

        fornecedor.setCnpj_fornecedor(null);
        return fornecedorRepository.save(fornecedor);
    }

    public void deletar(String cnpj_fornecedor) {
        fornecedorRepository.deleteById(cnpj_fornecedor);
    }

    public Fornecedor alterar(String cnpj_fornecedor, Fornecedor fornecedor) {
        fornecedor.setCnpj_fornecedor(cnpj_fornecedor);
        return fornecedorRepository.save(fornecedor);
    }

}
