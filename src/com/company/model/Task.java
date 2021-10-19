package com.company.model;

import com.company.costant.Area;
import com.company.exception.IncorrectValueException;

import java.util.Date;

public interface Task {

    Date dataInizio();
    Date dataFine();
    int numeroAree();
    Area areaPrincipale();
    Area[] aree();

    String percentualeCompletamento() throws IncorrectValueException;
    double percentuale();
    void avanzamentoPercentuale(double percentuale, Date attuale) throws IncorrectValueException;


    /**
     * Obtained
     */
    boolean inRitardo();

}
