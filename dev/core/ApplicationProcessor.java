package dev.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.lang.Exception;
import java.util.List;

import dev.model.Petshop;
import dev.model.PetshopStoreOption;
import dev.util.Input;

public class ApplicationProcessor {
    
    private List<Petshop> petshopStores;

    public ApplicationProcessor() {}

    public String process(Input input) throws Exception {

        try {

            this.validate(input);
            return moreViablePetshop(input);

        } catch (Exception e) {

            throw e;

        }

    }

   private String moreViablePetshop(Input input) {

        List<PetshopStoreOption> options = new ArrayList<PetshopStoreOption>();

        if (this.isWeekend(input.getDate())) {

            for (Petshop store : this.petshopStores) {
            
                options.add(
                    new PetshopStoreOption(
                        store,
                        store.getSmallDogBathPriceOnWeekend() * input.getSmallDogAmount() +
                        store.getBigDogBathPriceOnWeekend() * input.getBigDogAmount()
                    )
                );
            
            }

        } else {

            for (Petshop store : this.petshopStores) {

                options.add(
                    new PetshopStoreOption(
                        store,
                        store.getSmallDogBathPrice() * input.getSmallDogAmount() +
                        store.getBigDogBathPrice() * input.getBigDogAmount()
                    )
                );

            }

        }

        Collections.sort(options);

        return options.get(0).toString();

    }

    private void validate(Input input) throws Exception {

        if (input.getDate().before(new Date())) {
            throw new Exception("The date entered cannot be earlier than today.");
        };

        if (input.getSmallDogAmount() < 0) {
            throw new Exception("The amount of small dog can't be less then 0 (zero). Please, try with another value.");
        }

        if (input.getBigDogAmount() < 0) {
            throw new Exception("The amount of big dog can't be less then 0 (zero). Please, try with another value.");
        }

    }

    private boolean isWeekend(Date date) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return (
            calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ||
            calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
        );

    }

    public void setPetshopStores(List<Petshop> petshopStores) {

        this.petshopStores = petshopStores;

    }

}
