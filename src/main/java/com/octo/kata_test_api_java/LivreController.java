package com.octo.kata_test_api_java;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivreController {

    private final LivreRepository repository;

    LivreController(LivreRepository repository) {
        this.repository = repository;
    }

	@GetMapping("/livres")
	public List<Livre> all() {
		
        return this.repository.findAll();
	}
}
