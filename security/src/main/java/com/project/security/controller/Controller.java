package com.project.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
public class Controller {

    @CrossOrigin("*")
    @GetMapping("/greetings")
    public ResponseEntity<String> greetings() {
        return ResponseEntity.ok("Essas sao as pessoas do sistema");
    }

    @CrossOrigin("*")
    @GetMapping("/")
    public ResponseEntity<List<String>> listAll() {

        List<String> pessoas = new ArrayList<>();
        pessoas.add("Pedro Henrique");
        pessoas.add("Jose Felicio");
        pessoas.add("Amanda Soarez");
        pessoas.add("Joao Armando");

        return ResponseEntity.ok(pessoas);
    }
}
