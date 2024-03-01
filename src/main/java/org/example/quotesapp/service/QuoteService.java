package org.example.quotesapp.service;

import org.example.quotesapp.entity.quote;

import java.util.List;
import java.util.Optional;

public interface QuoteService {

    quote guardar(quote cita);
    List<quote> findAll();

    Optional<quote> encontrarId(Long ident);
}
