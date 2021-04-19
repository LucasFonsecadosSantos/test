package dev.model;

/**
 * 
 * PETSHOP TEST PROJECT FOR DTI - Digital
 * Written by Lucas Fonseca dos Santos
 * github.com/LucasFonscaDosSantos
 * 
 * This classes implements an object that stores some 
 * petshop and the results of bath total values calculation.
 * It implements a comparable interface because your position 
 * at list is defined in the better petshop options aspect.
 * 
 * @version 1.0 - SNAPSHOT
 * @author Lucas Fonseca dos Santos
 * 
 */
public class PetshopOption implements Comparable<PetshopOption> {
    
    /**
     * The petshop object;
     */
    private Petshop store;

    /**
     * The baths total value.
     */
    private double totalValue;

    /**
     * The petshop option object constructor.
     * It requires a petshop object and a total value
     * of baths.
     * 
     * @param store A petshop object.
     * @param totalValue A double value that represents the bath total value.
     */
    public PetshopOption(Petshop store, double totalValue) {

        this.store = store;
        this.totalValue = totalValue;

    }

    /**
     * The accessor method for store attribute.
     * 
     * @return Petshop An object of petshop entitie.
     */
    public Petshop getPetshopStore() { return this.store; }

    /**
     * The total value attribute accessor method.
     * 
     * @return double The bath total value.
     */
    public double getTotalValue() { return this.totalValue; }

    /**
     * The distance attribute method accessor.
     * 
     * @return double The distance of petshop.
     */
    public double getPetshopDistance() { return this.store.getDistance(); }

    /**
     * 
     * The overrride toString method.
     * 
     * @return String The textual representation of this object.
     */
    @Override
    public String toString() {

        return "The most viable option would be " 
                + this.store.getName() 
                + " with a total value of " 
                + this.getTotalValue();

    }

    /**
     * The implementation of compareTo method from 
     * comparable interface. It represents the criterion 
     * of the solution select.
     * 
     * @return int The result defined by comparable pattern.
     */
    @Override
    public int compareTo(PetshopOption option) {

        if (this.totalValue < option.getTotalValue()) {

            return -1;

        } else if (this.totalValue > option.getTotalValue()) {

            return 1;

        } else if (this.getPetshopDistance() < option.getPetshopDistance()) {

            return -1;

        } else if (this.getPetshopDistance() > option.getPetshopDistance()) {

            return 1;

        } else {

            return 0;

        }

    }

}
