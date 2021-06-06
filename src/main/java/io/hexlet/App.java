package io.hexlet;

import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("0 - Exit");
            int choice = sc.nextInt();
            System.out.println("Your choice: " + choice);
            System.out.println("Welcome to the Brain Games!");
            switch (choice) {
                case 1:
                    Cli.cli();
                    break;
                case 0:
                    System.exit(0);
                    break;
                case 2:
                    Even.even();
                    break;
                default:
                    break;
            }
        }
    }
}
