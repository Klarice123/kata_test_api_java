package com.octo.kata_test_api_java;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Livre {
    
    private @Id @GeneratedValue Long id;

    public String titre;
    public String langue;
    public boolean estUneEditionLimitee;
    
    Livre(){}

    Livre (String titre, String langue, boolean estUneEditionLimitee) {
        this.titre = titre;
        this.langue = langue;
        this.estUneEditionLimitee = estUneEditionLimitee;
    }
}
