package com.octo.kata_test_api_java;

import org.springframework.data.jpa.repository.JpaRepository;

interface LivreRepository extends JpaRepository<Livre, Long>{
    
}
