package com.company.model;

import com.company.costant.Area;

/**
 * @author Cristian Zanna
 */
public class Responsabile implements User{
    private final String nome;
    private final String cognome;
    private final String mail;
    private Area areaDiCompetenza;
    private Task task;

    public Responsabile(String nome, String cognome, String mail){
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
    }

    public void setAreaDiCompetenza(Area areaDiCompetenza) {
        this.areaDiCompetenza = areaDiCompetenza;
    }

    public void setTask(Task task) {
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
        return this.areaDiCompetenza;
    }

    @Override
    public Task taskSvolta() {
        return this.task;
    }

    @Override
    public boolean allocatoSuTask() {
        if(this.task != null){
            return true;
        }
        return false;
    }
}
