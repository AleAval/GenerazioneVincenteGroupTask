//scaglione matilde
package com.company.model;

import com.company.costant.Area;

public class Admin implements User{

    private String nome;
    private String cognome;
    private String mail;

    public void Admin (String nome, String cognome) {
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

	@Override
	public String Nome() {
		// TODO Auto-generated method stub
		return null;
	}

}


