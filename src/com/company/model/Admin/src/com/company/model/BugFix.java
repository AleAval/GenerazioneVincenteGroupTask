//scaglione matilde
package com.company.model;

import com.company.costant.Area;
import com.company.exception.IncorrectValueException;

import java.util.Date;

public class BugFix implements Task{

    private final Date inizio;
    private Date fine;
    private double completamento;
    private final Area area;

    @Override
    public Date dataInizio() {
        return null;
    }

    @Override
    public Date dataFine() {
        return null;
    }

    @Override
    public int numeroAree() {
        return 0;
    }

    @Override
    public Area areaPrincipale() {
        return null;
    }

    @Override
    public Area[] aree() {
        return new Area[0];
    }

    @Override
    public String percentualeCompletamento() throws IncorrectValueException {
        return null;
    }

    @Override
    public double percentuale() {
        return 0;
    }

    @Override
    public void avanzamentoPercentuale(double percentuale, Date attuale) throws IncorrectValueException {

    }

    @Override
    public boolean inRitardo() {
        return false;
    }
}