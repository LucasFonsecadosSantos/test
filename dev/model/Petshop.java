package dev.model;

/**
 * 
 * PETSHOP TEST PROJECT FOR DTI - Digital
 * Written by Lucas Fonseca dos Santos
 * github.com/LucasFonscaDosSantos
 * 
 * This class represents the Petshop entitie in 
 * the program.
 * 
 * @version 1.0 - SNAPSHOT
 * @author Lucas Fonseca dos Santos
 * 
 */
public class Petshop {

    /**
     * The petshop name attribute.
     */
    private String name;

    /**
     * The petshop distance attribute.
     */
    private double distance;

    /**
     * The big dog bath price attribute.
     */
    private double bigDogBathPrice;

    /**
     * The small dog bath price attribute.
     */
    private double smallDogBathPrice;

    /**
     * The price policy interface.
     */
    private PricePolicy pricePolicy;

    /**
     * The petshop object constructor.
     * It doesn't require parameter.
     */
    public Petshop() {}

    /**
     * The petshop object constructor.
     * It requires  the name and distance as 
     * paramters.
     * 
     * @param name The petshop name.
     * @param distance The petshop distance.
     */
    public Petshop(String name, double distance) {

        this.setName(name);
        this.setDistance(distance);

    }

    /**
     * A builder design pattern modifier method to 
     * weekend price policy attribute.
     * 
     * @param policy The price policy interface.
     * @return Petshop An instance of this class.
     */
    public Petshop setWeekendPrices(PricePolicy policy) {

        this.pricePolicy = policy;

        return this;

    }

    /**
     * It returns the price of big dog bath modified 
     * based on weekend criterion.
     * 
     * @return double The bath price.
     */
    public double getBigDogBathPriceOnWeekend() {

        return this.pricePolicy.getBigDogBathPriceOnWeekend(this.getBigDogBathPrice());

    }
    
    /**
     * It returns the price of small dog bath modified 
     * based on weekend criterion.
     * 
     * @return double The bath price.
     */
    public double getSmallDogBathPriceOnWeekend() {

        return this.pricePolicy.getSmallDogBathPriceOnWeekend(this.getSmallDogBathPrice());

    }

    /**
     * A builder design pattern modifier 
     * method of big dog bath price attribute.
     * 
     * @param price THe big dog bath price.
     * @return Petshop An instance of this class.
     */
    public Petshop setBigDogBathPrice(double price) {

        this.bigDogBathPrice = price;

        return this;

    }

    /**
     * A builder design pattern modifier 
     * method of small dog bath price attribute.
     * 
     * @param price THe small dog bath price.
     * @return Petshop An instance of this class.
     */
    public Petshop setSmallDogBathPrice(double price) {

        this.smallDogBathPrice = price;

        return this;

    }

    /**
     * A builder design pattern modifier 
     * method of name attribute.
     * 
     * @param name The petshop name.
     * @return Petshop An instance of this class.
     */
    public Petshop setName(String name) {

        this.name = name;

        return this;

    }

    /**
     * A builder design pattern modifier 
     * method of distance attribute.
     * 
     * @param distance The petshop distance.
     * @return Petshop An instance of this class.
     */
    public Petshop setDistance(double distance) {

        this.distance = distance;

        return this;

    }

    /**
     * The builder design pattern method.
     *
     * @return Petshop An instance of this class.
     */
    public Petshop build() { return this; }

    /**
     * The name attribute accessor method.
     * 
     * @return String The name attribute state.
     */
    public String getName() { return this.name; }

    /**
     * The distance attribute accessor method.
     * 
     * @return double The distance attribute state.
     */
    public double getDistance() { return this.distance; }

    /**
     * The small dog bath price attribute 
     * accessor method.
     * 
     * @return double The small dog bath price.
     */
    public double getSmallDogBathPrice() { return this.smallDogBathPrice; }

    /**
     * The big dog bath price attribute 
     * accessor method.
     * 
     * @return double The big dog bath price.
     */
    public double getBigDogBathPrice() { return this.bigDogBathPrice; }

}
