package com.megatec.backendmegatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megatec.backendmegatec.model.Vendas;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Integer> {

}
