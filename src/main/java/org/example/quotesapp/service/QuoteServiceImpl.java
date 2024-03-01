package org.example.quotesapp.service;

import org.example.quotesapp.entity.quote;
import org.example.quotesapp.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class QuoteServiceImpl implements QuoteService {

    @Autowired
    private QuoteRepository repository;

    @Override
    @Transactional
    public quote guardar(quote cita) {
        return repository.save(cita);
    }

    @Override
    @Transactional
    public List<quote> findAll() {
        return (List<quote>) repository.findAll();
    }

    @Override
    @Transactional
    public Optional<quote> encontrarId(Long ident) {
        return repository.findById(ident);
    }
}
