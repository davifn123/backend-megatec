package com.megatec.backendmegatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.megatec.backendmegatec.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, String> {

        // @Query("SELECT f from Fornecedor f "
        // + " where f.fornecedor.cnpj_fornecedor = :cnpj_fornecedor")
        // Fornecedor findByIdFornecedor(String cnpj_fornecedor);

        @Query("SELECT f from Fornecedor f "
                        + " where f.nome_fornecedor = :nome_fornecedor")
        Fornecedor findByNomeFornecedor(String nome_fornecedor);

        @Query("SELECT f from Fornecedor f "
                        + " where f.cnpj_fornecedor = :cnpj_fornecedor")
        Fornecedor findByIdCnpj(String cnpj_fornecedor);

        // @Query("DELETE from Fornecedor f"
        // + " where f.cnpj_fornecedor = :cnpj_fornecedor")
        // Fornecedor deleteByCnpjFornecedor(String cnpj_fornecedor);

}
