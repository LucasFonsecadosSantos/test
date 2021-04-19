package dev.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * PETSHOP TEST PROJECT FOR DTI - Digital
 * Written by Lucas Fonseca dos Santos
 * github.com/LucasFonscaDosSantos
 * 
 * This class represents a simple parser used in 
 * this project.
 * 
 * @version 1.0 - SNAPSHOT
 * @author Lucas Fonseca dos Santos
 * 
 */
public class Parser {
    
    /**
     * This method is responsible for string input treatment to extract a date 
     * information, entered by the user.
     * 
     * @param position Argument position in string entered by the user.
     * @param input The object that stores the data inputed by the user.
     * @return Date A Date object with date information.
     * @throws Exception Thrown in case of wrong date text.
     */
    public Date getDateArgument(int position, String input) throws Exception {

        String token = input.split(" ")[position];

        return new SimpleDateFormat("dd/MM/yyyy")
                    .parse(token);

    }

    /**
     * This method is responsible for string input treatment interger values  
     * information, entered by the user.
     * 
     * @param position Argument position in string entered by the user.
     * @param input The object that stores the data inputed by the user.
     * @return int An integer extracted value.
     * @throws Exception Thrown in case of wrong interger text.
     */
    public int getPositiveIntegerArgument(int position, String input) throws Exception {

        try {

            return Integer.parseInt(input.split(" ")[position]);

        } catch (Exception e) {
    
            throw e;

        }

    }

}
