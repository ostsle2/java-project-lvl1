package io.hexlet;

import io.hexlet.code.Engine;
import io.hexlet.games.*;

import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
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
                    Engine.gamePlay(new Even());
                    break;
                case calc:
                    Engine.gamePlay(new Calc());
                    break;
                case gcd:
                    Engine.gamePlay(new GCD());
                    break;
                case progression:
                    Engine.gamePlay(new Progression());
                    break;
                case prime:
                    Engine.gamePlay(new Prime());
                    break;
                default:
                    break;
            }
        }
    }
}
