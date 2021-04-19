package dev.view;

import java.util.Scanner;

/**
 * 
 * PETSHOP TEST PROJECT FOR DTI - Digital
 * Written by Lucas Fonseca dos Santos
 * github.com/LucasFonscaDosSantos
 * 
 * This class implements the command line interface that 
 * interacts with user.
 * 
 * @version 1.0 - SNAPSHOT
 * @author Lucas Fonseca dos Santos
 * 
 */
public class Cli {
    
    /**
     * The Java Scanner object.
     */
    private Scanner scanner;

    /**
     * The command line interface object constructor.
     * It doesn't require parameters.
     */
    public Cli() { this.scanner = new Scanner(System.in); }

    /**
     * This method captures user input.
     * 
     * @return String The user input.
     */
    public String getUserInput() { return this.scanner.nextLine(); }

    /**
     * This method is responsible just to print some message
     * in interface.
     * 
     * @param message A string message.
     */
    public static void message(String message) { System.out.println(message); }

    /**
     * This method is responsible just to print some 
     * error message in interface.
     * 
     * @param error A error string message.
     */
    public static void errorMessage(String error) { System.out.println("[ !! ] " + error); }

}
