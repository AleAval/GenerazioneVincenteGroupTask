package com.company.utils;

import com.company.exception.IncorrectValueException;

public abstract class TaskUtils {
    public static String percentualeCompletamento(int value) throws IncorrectValueException{
        if (value < 0 || value > 100) {
            throw new IncorrectValueException("Valore immesso al di fuori del range");
        } else {
            return "" + value + "%";
        }
    }

    public static String percentualeCompletamento(double value) throws IncorrectValueException{
        if (value < 0 || value > 100) {
            throw new IncorrectValueException("Valore immesso al di fuori del range");
        } else {
            return "" + value + "%";
        }
    }
}
