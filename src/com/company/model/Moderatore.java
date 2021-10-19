package com.company.model;

import com.company.costant.Area;
// @Author Andrea Innacolo
public class Moderatore implements User{

    private final String nome;
    private final String cognome;
    private final String mail;
    private Area area;
    private Task task;

    public Moderatore(String nome, String cognome, String mail){
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
        return null;
    }
    @Override
    public String getCognome() {
        return null;
    }
    @Override
    public String getMail() {
        return null;
    }
    @Override
    public Area appartiene() {
        return null;
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
