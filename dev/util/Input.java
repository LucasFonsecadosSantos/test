package dev.util;

import java.util.Date;
import java.lang.Exception;

public class Input {
    
    private Date date;
    private int smallDogAmount;
    private int bigDogAmount;

    public Input(String input) throws Exception {

        try {

            this.setDate(Parser.getDateArgument(0, input));
            this.setSmallDogAmount(Parser.getPositiveIntegerArgument(1, input));
            this.setBigDogAmount(Parser.getPositiveIntegerArgument(2, input));

        } catch (Exception e) {

            throw e;

        }

    }

    private void setDate(Date date) { this.date = date; }

    private void setSmallDogAmount(int amount) { this.smallDogAmount = amount; }

    private void setBigDogAmount(int amount) { this.bigDogAmount = amount; }

    public Date getDate() { return this.date; }

    public int getSmallDogAmount() { return this.smallDogAmount; }
    
    public int getBigDogAmount() { return this.bigDogAmount; }

    @Override
    public String toString() {
        return "Date: " + this.getDate() + "\nSmall Dog Amount: " + this.getSmallDogAmount() + "\nBig Dog Amount: " + this.getBigDogAmount();
    }

}
