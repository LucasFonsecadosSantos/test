package dev.view;

import java.util.Scanner;

public class Cli {
    
    private Scanner scanner;

    public Cli() { this.scanner = new Scanner(System.in); }

    public String getUserInput() { return this.scanner.nextLine(); }

    public static void message(String message) { System.out.println(message); }

}
