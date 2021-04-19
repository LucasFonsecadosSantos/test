package dev.model;

/**
 * 
 * PETSHOP TEST PROJECT FOR DTI - Digital
 * Written by Lucas Fonseca dos Santos
 * github.com/LucasFonscaDosSantos
 * 
 * This interface is used for change pricing comportament 
 * of petshop based on week day.
 * The petshop receveis an implementation of the methods 
 * defined here.
 * 
 * @version 1.0 - SNAPSHOT
 * @author Lucas Fonseca dos Santos
 * 
 */
public interface PricePolicy {
    
    public double getSmallDogBathPriceOnWeekend(double value);
    public double getBigDogBathPriceOnWeekend(double value);

}
