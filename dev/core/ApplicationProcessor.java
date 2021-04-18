package dev.core;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Exception;
import java.util.List;

import dev.model.Petshop;
import dev.model.PetshopOption;
import dev.util.DateUtils;
import dev.util.Input;

public class ApplicationProcessor {
    
    private List<Petshop> petshops;

    public ApplicationProcessor() {}

    public String process(Input input) throws Exception {

        try {

            return moreViablePetshop(input);

        } catch (Exception e) {

            throw e;

        }

    }

    public void setPetshops(List<Petshop> petshops) {

        this.petshops = petshops;

    }

    private double getSmallDogPrice(Input input, Petshop store) {

        return (DateUtils.isWeekend(input.getDate()))   ? store.getSmallDogBathPriceOnWeekend()   : store.getSmallDogBathPrice();

    }

    private String moreViablePetshop(Input input) {

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

    private double getBigDogPrice(Input input, Petshop store) {

        return (DateUtils.isWeekend(input.getDate()))   ? store.getBigDogBathPriceOnWeekend()     : store.getBigDogBathPrice();

    }

}
