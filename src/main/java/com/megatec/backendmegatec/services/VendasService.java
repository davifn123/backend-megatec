package com.megatec.backendmegatec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megatec.backendmegatec.model.Vendas;
import com.megatec.backendmegatec.repository.VendasRepository;

@Service
public class VendasService {

    @Autowired
    private VendasRepository vendasRepository;

    public List<Vendas> obterTodos() {
        // regra de negocio caso tenha
        return vendasRepository.findAll();
    }

    public Optional<Vendas> obterPorId(Integer id) {

        return vendasRepository.findById(id);

    }

    public Vendas adicionar(Vendas vendas) {

        vendas.setId(null);
        return vendasRepository.save(vendas);

    }

    public void deletar(Integer id) {
        vendasRepository.deleteById(id);
    }

    public Vendas alterar(Integer id, Vendas vendas) {

        // recebe id pela url
        vendas.setId(id);
        return vendasRepository.save(vendas);
    }

}
