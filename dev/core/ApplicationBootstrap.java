package dev.core;

import java.util.List;

import dev.model.Input;
import dev.model.Petshop;
import dev.view.Cli;

/**
 * 
 * PETSHOP TEST PROJECT FOR DTI - Digital
 * Written by Lucas Fonseca dos Santos
 * github.com/LucasFonscaDosSantos
 * 
 * This class is responsible for application load.
 * Here there is the instantiation of the main project
 * modules.
 * 
 * @version 1.0 - SNAPSHOT
 * @author Lucas Fonseca dos Santos
 * 
 */
public class ApplicationBootstrap {
    
    /**
     * Command Line Interface mechanism
     */
    private Cli cli;

    /**
     * The main module of this project, Application Processor.
     */
    private ApplicationProcessor appProcessor;

    /**
     * The validations module.
     */
    private ApplicationValidations appValidations;

    /**
     * The DAO module.
     */
    private ApplicationDataLoader appDataLoader;

    /**
     * ApplicationBootstrap constructor
     * without paramters.
     */
    public ApplicationBootstrap() {

        this.cli = new Cli();
        this.appProcessor   = new ApplicationProcessor();
        this.appValidations = new ApplicationValidations();
        this.appDataLoader = new ApplicationDataLoader();

    }

    /**
     * The main method of this prject.
     * Here it coordenates the program execution 
     * and receives any exception thrown from another
     * parts.
     */
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
