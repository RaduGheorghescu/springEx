package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nume;
    private String prenume;
    private Integer medie;

    @ManyToOne
    private Oras oras;

    public Student() {
    }

    public Student(String nume, String prenume, Integer medie) {
        this.nume = nume;
        this.prenume = prenume;
        this.medie = medie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getMedie() {
        return medie;
    }

    public void setMedie(Integer medie) {
        this.medie = medie;
    }

    public Oras getOras() {
        return oras;
    }

    public void setOras(Oras oras) {
        this.oras = oras;
    }
}
