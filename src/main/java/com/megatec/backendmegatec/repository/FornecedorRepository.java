package com.megatec.backendmegatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.megatec.backendmegatec.model.Fornecedor;
import com.megatec.classesId.FornecedorId;

public interface FornecedorRepository extends JpaRepository<Fornecedor, FornecedorId> {

        @Query("SELECT f from Fornecedor f "
                        + " where f.fornecedorId.id = :id")
        Fornecedor findByIdFornecedor(Integer id);

        @Query("SELECT f from Fornecedor f "
                        + " where like f.nome_fornecedor = :nome_fornecedor")
        Fornecedor findByNomeFornecedor(String nome_fornecedor);

        @Query("SELECT f from Fornecedor f "
                        + "where like f.cnpj_fornecedor = :cnpj_fornecedor")
        Fornecedor findByCnpj(String cnpj_fornecedor);

        @Query("DELETE from Fornecedor f"
                        + " where f.fornecedorId.id = :id")
        Fornecedor deleteByIdFornecedor(Integer id);

}
