package com.megatec.backendmegatec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megatec.backendmegatec.model.Financeiro;
import com.megatec.backendmegatec.repository.FinanceiroRepository;

@Service
public class FinanceiroService {

    @Autowired
    private FinanceiroRepository financeiroRepository;

    public List<Financeiro> obterTodos() {
        // regra de negocio caso tenha
        return financeiroRepository.findAll();
    }

    public Optional<Financeiro> obterPorId(Integer id) {

        return financeiroRepository.findById(id);

    }

    public Financeiro adicionar(Financeiro financeiro) {

        financeiro.setId(null);
        return financeiroRepository.save(financeiro);

    }

    public void deletar(Integer id) {
        financeiroRepository.deleteById(id);
    }

    public Financeiro alterar(Integer id, Financeiro financeiro) {

        // recebe id pela url
        financeiro.setId(id);
        return financeiroRepository.save(financeiro);
    }

}
