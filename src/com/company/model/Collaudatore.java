package com.company.model;

//FRANCESCO FARO

import com.company.costant.Area;

public class Collaudatore implements User{

    private final String nome;
    private final String cognome;
    private String mail;
    private Area area;
    private Task task;

    public Collaudatore(String nome, String cognome, String mail, Area area, Task task) {
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
        this.area = area;
        this.task = task;
    }

    //----------------------------------------------------------------------------------------------------------------//

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    //----------------------------------------------------------------------------------------------------------------//

    @java.lang.Override
    public String getNome() {
        return null;
    }

    @java.lang.Override
    public String getCognome() {
        return null;
    }

    @java.lang.Override
    public String getMail() {
        return null;
    }

    @java.lang.Override
    public Area appartiene() {
        return null;
    }

    @java.lang.Override
    public Task taskSvolta() {
        return null;
    }

    @java.lang.Override
    public boolean allocatoSuTask() {
        return false;
    }
}
