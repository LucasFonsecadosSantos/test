package dev.core;

import java.util.Date;

import dev.model.Input;

/**
 * 
 * PETSHOP TEST PROJECT FOR DTI - Digital
 * Written by Lucas Fonseca dos Santos
 * github.com/LucasFonscaDosSantos
 * 
 * This class makes any validations required 
 * by the program.
 * 
 * @version 1.0 - SNAPSHOT
 * @author Lucas Fonseca dos Santos
 * 
 */
public class ApplicationValidations {

    /**
     * Responsible for user input validation.
     * It validates the date and dogs amount.
     * 
     * @param input An object with all entered data by the user.
     * @throws Exception Exception thrown in case of data invalidation.
     */
    public void validate(Input input) throws Exception {

        if (input.getDate().before(new Date())) {
            throw new Exception("The date entered cannot be earlier than today.");
        };

        if (input.getSmallDogAmount() < 0) {
            throw new Exception("The amount of small dog can't be less then 0 (zero). Please, try with another value.");
        }

        if (input.getBigDogAmount() < 0) {
            throw new Exception("The amount of big dog can't be less then 0 (zero). Please, try with another value.");
        }

    }

}