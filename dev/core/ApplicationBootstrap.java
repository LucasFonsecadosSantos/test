package dev.core;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import dev.model.Petshop;
import dev.model.PricePolicy;
import dev.util.Input;
import dev.view.Cli;

public class ApplicationBootstrap {
    
    private Cli cli;
    private ApplicationProcessor appProcessor;

    public ApplicationBootstrap() {

        this.cli = new Cli();
        this.appProcessor = new ApplicationProcessor();

    }

    public void run() {

        try {
            
            Input input = new Input(this.cli.getUserInput());
            this.appProcessor.setPetshopStores(this.getPetshops());
            Cli.message(this.appProcessor.process(input));
        
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    private List<Petshop> getPetshops() {

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
