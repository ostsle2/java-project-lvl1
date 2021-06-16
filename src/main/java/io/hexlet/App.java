package io.hexlet;

import io.hexlet.games.Calc;
import io.hexlet.games.Even;
import io.hexlet.games.GCD;

import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int calc = 3;
        final int gcd = 4;
        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
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
                case calc:
                    Calc.calc();
                    break;
                case gcd:
                    GCD.gcd();
                    break;
                default:
                    break;
            }
        }
    }
}
