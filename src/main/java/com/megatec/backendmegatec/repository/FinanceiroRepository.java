package com.megatec.backendmegatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megatec.backendmegatec.model.Financeiro;

@Repository
public interface FinanceiroRepository extends JpaRepository<Financeiro, Integer> {

}
