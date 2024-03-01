package org.example.quotesapp.repository;


import jakarta.persistence.Id;
import org.example.quotesapp.entity.quote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface QuoteRepository extends CrudRepository<quote,Long> {
}
