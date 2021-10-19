//Emanuele Moccia
package com.company.model;

import com.company.costant.Area;

public class Esecutore_Middle implements User{
private String Nome;
private String Cognome;
    private String Mail;
    private final short LivelloCompetenze = 2;
    private Area appartiene;
    private Task task;

    public Esecutore_Middle(String Nome, String Cognome) {
this.Nome = Nome;
this.Cognome = Cognome;
    }

    public short getLivelloCompetenze() {
        return LivelloCompetenze;
    }

    @Override
    public String getNome() {
        return this.Nome;
    }

    @Override
    public String getCognome() {
        return this.Cognome;
    }

    @Override
    public String getMail() {
        return this.Mail;
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
        return false;
    }
}
