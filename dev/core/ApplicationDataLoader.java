package dev.core;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import dev.model.Petshop;
import dev.model.PricePolicy;

public class ApplicationDataLoader {
    
    public List<Petshop> getPetshops() {

        return new ArrayList<Petshop>(Arrays.asList(

                new Petshop()
                        .setName("Meu Canino Feliz")
                        .setDistance(2.0)
                        .setSmallDogBathPrice(20.00)
                        .setBigDogBathPrice(40.00)
                        .setWeekendPrices(new PricePolicy(){
                            
                            @Override
                            public double getBigDogBathPriceOnWeekend(double value) {

                                return (value + (.20 * value));

                            }

                            @Override
                            public double getSmallDogBathPriceOnWeekend(double value) {

                                return (value + (.20 * value));

                            }

                       })
                        .build(),
                
                new Petshop()
                        .setName("Vai Rex")
                        .setDistance(1.7)
                        .setSmallDogBathPrice(15.00)
                        .setBigDogBathPrice(50.00)
                        .setWeekendPrices(new PricePolicy(){
                            
                            @Override
                            public double getBigDogBathPriceOnWeekend(double value) {

                                return (value + 5);

                            }

                            @Override
                            public double getSmallDogBathPriceOnWeekend(double value) {

                                return (value + 5);

                            }

                       })
                        .build(),

                new Petshop()
                        .setName("ChowChawgas")
                        .setDistance(0.8)
                        .setSmallDogBathPrice(30.00)
                        .setBigDogBathPrice(45.00)
                        .setWeekendPrices(new PricePolicy(){
                            
                            @Override
                            public double getBigDogBathPriceOnWeekend(double value) {

                                return value;

                            }

                            @Override
                            public double getSmallDogBathPriceOnWeekend(double value) {

                                return value;

                            }

                        })
                        .build()
            )

        );

    }

}
