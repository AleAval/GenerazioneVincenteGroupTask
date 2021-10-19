package com.company.model;

import com.company.costant.Area;

public class Consulente implements User{

    private final String nome;
    private final String cognome;
    private final String mail;
    private Area area;
    private Task task;


    public Consulente(String nome, String cognome, String mail) {
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
    }

    public final void setArea(final Area area) {
        this.area = area;
    }


    public final void setTask(final Task task) {
        this.task = task;
    }

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
        return this.area;
    }

    @Override
    public Task taskSvolta() {
        return null;
    }

    @Override
    public boolean allocatoSuTask() {
        return false;
    }
}
