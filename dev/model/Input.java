package dev.model;

import java.util.Date;
import java.lang.Exception;

import dev.tool.Parser;

/**
 * 
 * PETSHOP TEST PROJECT FOR DTI - Digital
 * Written by Lucas Fonseca dos Santos
 * github.com/LucasFonscaDosSantos
 * 
 * This class is responsible for storing 
 * the information entered by the user.
 * It stores the date, small dog amount and 
 * big dog amount.
 * 
 * @version 1.0 - SNAPSHOT
 * @author Lucas Fonseca dos Santos
 * 
 */
public class Input {
    
    /**
     * Parser object used the handle the input.
     */
    private Parser parser;

    /**
     * Date object informed by the user.
     */
    private Date date;

    /**
     * Small dog amount informed by the user.
     */
    private int smallDogAmount;

    /**
     * Big dog amount informed by the user.
     */
    private int bigDogAmount;
    
    /**
     * The input object constructor with parameter.
     * It requires a string argument from the user.
     * 
     * @param input A string argument from the user.
     * @throws Exception Thrown in case of parsing invalidation.
     */
    public Input(String input) throws Exception {

        this.parser = new Parser();

        try {
            
            this.setDate(this.parser.getDateArgument(0, input));
            this.setSmallDogAmount(this.parser.getPositiveIntegerArgument(1, input));
            this.setBigDogAmount(this.parser.getPositiveIntegerArgument(2, input));

        } catch (Exception e) {

            throw e;

        }

    }

    /**
     * The accessor method for date attribute.
     * 
     * @return Date Date object
     */
    public Date getDate() { return this.date; }

    /**
     * Accessor method for small dog amount attribute.
     * 
     * @return int The amount of small dog.
     */
    public int getSmallDogAmount() { return this.smallDogAmount; }
    
    /**
     * Accessor method for big dog amount attribute.
     * 
     * @return int The amount of big dog.
     */
    public int getBigDogAmount() { return this.bigDogAmount; }

    /**
     * Override toString method.
     * 
     * @return String The textual object representation.
     */
    @Override
    public String toString() {
        return "Date: " + this.getDate() + "\nSmall Dog Amount: " + this.getSmallDogAmount() + "\nBig Dog Amount: " + this.getBigDogAmount();
    }

    /**
     * The modifier method of date attribute.
     * 
     * @param date A date object.
     */
    private void setDate(Date date) { this.date = date; }

    /**
     * The modifier method of small dog amount attribute.
     * 
     * @param amount The amount of small dog.
     */
    private void setSmallDogAmount(int amount) { this.smallDogAmount = amount; }

    /**
     * The modifier method of big dog amount attribute.
     * 
     * @param amount The amount of big dog.
     */
    private void setBigDogAmount(int amount) { this.bigDogAmount = amount; }

}
