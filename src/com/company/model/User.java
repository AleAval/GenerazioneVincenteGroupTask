package com.company.model;

import com.company.costant.Area;

public interface User {

    String getNome();
    String getCognome();
    String getMail();

    Area appartiene();
    Task taskSvolta();

    /**
     * Obtained
     */
    boolean allocatoSuTask();

}
