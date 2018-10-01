package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Oras {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String numeOras;
    private String judet;

    public Oras() {
    }

    public Oras(String numeOras, String judet) {
        this.numeOras = numeOras;
        this.judet = judet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeOras() {
        return numeOras;
    }

    public void setNumeOras(String numeOras) {
        this.numeOras = numeOras;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }
}
