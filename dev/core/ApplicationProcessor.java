package dev.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dev.handler.DateHandler;
import dev.model.Input;
import dev.model.Petshop;
import dev.model.PetshopOption;

/**
 * 
 * PETSHOP TEST PROJECT FOR DTI - Digital
 * Written by Lucas Fonseca dos Santos
 * github.com/LucasFonscaDosSantos
 * 
 * This class is responsible for the main
 * processing of the project. Here occurs the 
 * calculation that makes up the most viable 
 * petshop solution.
 * 
 * @version 1.0 - SNAPSHOT
 * @author Lucas Fonseca dos Santos
 * 
 */
public class ApplicationProcessor {
    
    /**
     * The petshops list.
     */
    private List<Petshop> petshops;

    /**
     * The application processor constructor.
     * It doesn't require parameter.
     */
    public ApplicationProcessor() {}

    /**
     * 
     * It's responsible for select the best petshop option from the data
     * informed by the user.
     * The decision is based on the sum of the values whose result
     * is minimal between the petshops option.
     * 
     * In case of a tie, the criterion used is the minimum distance.
     * 
     * @param input The data entered by the user as date and dogs amount.
     * @return String A text with more viable petshop option information.
     */
    public String process(Input input) {

        List<PetshopOption> options = new ArrayList<PetshopOption>();

        for (Petshop store : this.petshops) {

            options.add(
                new PetshopOption(
                    store,
                    this.getSmallDogPrice(input, store) * input.getSmallDogAmount() +
                    this.getBigDogPrice(input, store) * input.getBigDogAmount()
                )
            );
        
        }

        Collections.sort(options);

        return options.get(0).toString();

    }

    /**
     * Modifier method for petshop attribute.
     * 
     * @param petshops A petshops list.
     */
    public void setPetshops(List<Petshop> petshops) {

        this.petshops = petshops;

    }

    /**
     * This method returns the total value of small dog baths
     * based on week day.
     * 
     * @param input An object with data entered by the user.
     * @param store The petshop instance.
     * @return double The total value of dog baths.
     */
    private double getSmallDogPrice(Input input, Petshop store) {

        DateHandler dh = new DateHandler();

        return (dh.isWeekend(input.getDate()))   ? store.getSmallDogBathPriceOnWeekend()   : store.getSmallDogBathPrice();

    }

    /**
     * This method returns the total value of big dog baths
     * based on week day.
     * 
     * @param input An object with data entered by the user.
     * @param store The petshop instance.
     * @return double The total value of dog baths.
     */
    private double getBigDogPrice(Input input, Petshop store) {

        DateHandler dh = new DateHandler();

        return (dh.isWeekend(input.getDate()))   ? store.getBigDogBathPriceOnWeekend()     : store.getBigDogBathPrice();

    }

}
