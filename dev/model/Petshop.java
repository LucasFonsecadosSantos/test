package dev.model;

public class Petshop {

    private String name;
    private double distance;
    private double bigDogBathPrice;
    private double smallDogBathPrice;
    private PricePolicy pricePolicy;

    public Petshop() {}

    public Petshop(String name, double distance) {

        this.setName(name);
        this.setDistance(distance);

    }

    public Petshop setWeekendPrices(PricePolicy policy) {

        this.pricePolicy = policy;

        return this;

    }

    public double getBigDogBathPriceOnWeekend() {

        return this.pricePolicy.getBigDogBathPriceOnWeekend(this.getBigDogBathPrice());

    }
    
    public double getSmallDogBathPriceOnWeekend() {

        return this.pricePolicy.getSmallDogBathPriceOnWeekend(this.getSmallDogBathPrice());

    }

    public Petshop setBigDogBathPrice(double price) {

        this.bigDogBathPrice = price;

        return this;

    }

    public Petshop setSmallDogBathPrice(double price) {

        this.smallDogBathPrice = price;

        return this;

    }

    public Petshop setName(String name) {

        this.name = name;

        return this;

    }

    public Petshop setDistance(double distance) {

        this.distance = distance;

        return this;

    }

    public Petshop build() { return this; }

    public String getName() { return this.name; }

    public double getDistance() { return this.distance; }

    public double getSmallDogBathPrice() { return this.smallDogBathPrice; }

    public double getBigDogBathPrice() { return this.bigDogBathPrice; }

}
