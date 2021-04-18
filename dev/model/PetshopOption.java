package dev.model;

public class PetshopOption implements Comparable<PetshopOption> {
    
    private Petshop store;
    private double totalValue;

    public PetshopOption(Petshop store, double totalValue) {

        this.store = store;
        this.totalValue = totalValue;

    }

    public Petshop getPetshopStore() { return this.store; }

    public double getTotalValue() { return this.totalValue; }

    public double getPetshopDistance() { return this.store.getDistance(); }

    @Override
    public String toString() {

        return "The most viable option would be " 
                + this.store.getName() 
                + " with a total value of " 
                + this.getTotalValue();

    }

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
