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

    public Optional<Fornecedor> obterPorId(String cnpj) {

        return fornecedorRepository.findById(cnpj);

    }

    public Fornecedor adicionar(Fornecedor fornecedor) {

        fornecedor.setCnpj(null);
        return fornecedorRepository.save(fornecedor);
    }

    public void deletar(String cnpj) {
        fornecedorRepository.deleteById(cnpj);
    }

    public Fornecedor alterar(String cnpj, Fornecedor fornecedor) {
        fornecedor.setCnpj(cnpj);
        return fornecedorRepository.save(fornecedor);
    }

}
