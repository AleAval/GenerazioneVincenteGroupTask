//Gianluca Zinna

package com.company.model;

import com.company.costant.Area;
import com.company.exception.IncorrectValueException;

import java.util.Date;

public class EsecutoreSenior implements User{

    private  final String nome, cognome;
    private String mail;

    public EsecutoreSenior(String nome, String cognome, String mail) {
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
    }

    private Area appartiene;
    private Task task;

    //User

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
