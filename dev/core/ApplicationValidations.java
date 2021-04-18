package dev.core;

import java.util.Date;

import dev.util.Input;

public class ApplicationValidations {

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