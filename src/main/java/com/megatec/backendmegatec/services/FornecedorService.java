package com.megatec.backendmegatec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megatec.backendmegatec.model.Fornecedor;
import com.megatec.backendmegatec.repository.FornecedorRepository;
import com.megatec.classesId.FornecedorId;

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

    public Fornecedor obterPorIdFornecedor(FornecedorId fornecedorId) {

        return fornecedorRepository.findByIdFornecedor(fornecedorId.getId(), fornecedorId.getCnpj_fornecedor());

    }

    public Fornecedor obterPorCnpj(Fornecedor fornecedor) {

        return fornecedorRepository.findByCnpj(fornecedor.getCnpj_fornecedor());

    }

    public void deletar(FornecedorId fornecedorId) {
        fornecedorRepository.deleteByIdFornecedor(fornecedorId.getId());
    }

    public Fornecedor alterar(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

}
