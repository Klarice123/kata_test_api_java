package com.octo.kata_test_api_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(LivreRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Livre("Bilbo Baggins", "burglar", true)));
      log.info("Preloading " + repository.save(new Livre("Frodo Baggins", "thief", false)));
    };
  }
}
