//Valerio Parente
package com.company.model;

import com.company.costant.Area;

public class SuperUser implements User{

    private final String nome;
    private final String cognome;
    private String mail;

    public SuperUser(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    private Area appartiene;
    private Task task;


    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getCognome() {
        return this.cognome;
    }

    @Override
    public String getMail() {
        return this.mail;
    }

    @Override
    public Area appartiene() {
        return this.appartiene;
    }

    @Override
    public Task taskSvolta() {
        return this.task;
    }

    @Override
    public boolean allocatoSuTask() {
        return true;
    }


}
