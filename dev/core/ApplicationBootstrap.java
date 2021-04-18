package dev.core;

import java.util.List;

import dev.model.Petshop;
import dev.util.Input;
import dev.view.Cli;

public class ApplicationBootstrap {
    
    private Cli cli;
    private ApplicationProcessor appProcessor;
    private ApplicationValidations appValidations;
    private ApplicationDataLoader appDataLoader;

    public ApplicationBootstrap() {

        this.cli = new Cli();
        this.appProcessor   = new ApplicationProcessor();
        this.appValidations = new ApplicationValidations();
        this.appDataLoader = new ApplicationDataLoader();

    }

    public void run() {

        try {
            
            Input input = new Input(this.cli.getUserInput());
            List<Petshop> petshops = this.appDataLoader.getPetshops();
            
            this.appValidations.validate(input);
            this.appProcessor.setPetshops(petshops);
            
            Cli.message(this.appProcessor.process(input));
        
        } catch (Exception e) {

            Cli.errorMessage(e.getMessage());

        }

    }

}
