//scaglione matilde
package com.company.model;


import com.company.costant.Area;
import com.company.exception.IncorrectValueException;
import com.company.utils.TaskUtils;

import java.util.Date;

public class Sviluppo implements Task {
    private final Date inizio;
    private Date fine;
    private double completamento;
    private final Area area;

    /**
     * Obtained
     */
    private boolean inRitardo = false;


    public Sviluppo(Date inizio, Date fine, double completamento, boolean inRitardo, Area area) {
        this.inizio = inizio;
        this.fine = fine;
        this.completamento = completamento;
        this.inRitardo = inRitardo;
        this.area = area;
    }


    @Override
    public Date dataInizio() {
        return this.inizio;
    }

    @Override
    public Date dataFine() {
        return this.fine;
    }

    @Override
    public int numeroAree() {
        return 1;
    }

    @Override
    public Area areaPrincipale() {
        return null;
    }

    @Override
    public Area[] aree() {
        return new Area[]{this.area};
    }


    @Override
    public String percentualeCompletamento() throws IncorrectValueException {
        return TaskUtils.percentualeCompletamento(this.completamento);
    }

    @Override
    public double percentuale() {
        return this.completamento;
    }

    @Override
    public void avanzamentoPercentuale(double percentuale, Date attuale) throws IncorrectValueException {
        if (percentuale < 0 || percentuale < this.completamento || percentuale > 100) {
            throw new IncorrectValueException("La percentuale dichiarata non è valida");
        } else {
            this.completamento = percentuale;
            this.inRitardo = (attuale.compareTo(this.fine) > 0);
        }
    }


    @Override
    public boolean inRitardo() {
        return this.inRitardo;
    }
}