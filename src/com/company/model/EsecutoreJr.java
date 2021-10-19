//Carmine Cinquegrana
package com.company.model;

import com.company.costant.Area;

public class EsecutoreJr implements User {
    private final String nome;
    private final String cognome;
    private final String mail;
    private Area area;
    private Task task;

    public EsecutoreJr(String nome, String cognome, String mail, Area area, Task task) {
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
        this.area = area;
        this.task = task;
    }

    @Override
    public String getNome() {
        return this.getNome() ;
    }

    @Override
    public String getCognome() {
        return this.getCognome();
    }

    @Override
    public String getMail() {
        return this.getMail();
    }

    @Override
    public Area appartiene() {
        return this.appartiene();
    }

    @Override
    public Task taskSvolta() {
        return this.taskSvolta();
    }

    @Override
    public boolean allocatoSuTask() {
        return this.allocatoSuTask();
    }
}
