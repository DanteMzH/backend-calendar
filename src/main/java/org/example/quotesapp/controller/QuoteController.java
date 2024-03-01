package org.example.quotesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.quotesapp.entity.quote;
import org.example.quotesapp.service.QuoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/quote")
@CrossOrigin(originPatterns = "*")
public class QuoteController {


    @Autowired
    private QuoteService service;

    @PostMapping
    public ResponseEntity<?> crearQuote(@RequestBody quote cita){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.guardar(cita));
    }

    @GetMapping("/users")
    public List<quote> listita(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> mostrarID(@PathVariable Long id){
        Optional<quote> userid = service.encontrarId(id);

        return ResponseEntity.ok(userid.orElseThrow());


    }

}
