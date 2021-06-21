package io.hexlet;

import io.hexlet.code.Engine;
import io.hexlet.games.Calc;
import io.hexlet.games.Even;
import io.hexlet.games.GCD;
import io.hexlet.games.Prime;
import io.hexlet.games.Progression;

import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuOption[] options = MenuOption.values();
        System.out.println("Please enter the game number and press Enter.");
        for (MenuOption option : options) {
            System.out.println(option.getNumber() + "-" + option.name());
        }
        int choice = sc.nextInt();
        System.out.println("Your choice: " + choice);
        System.out.println("Welcome to the Brain Games!");
        MenuOption option = options[choice];
        switch (option) {
            case Exit:
                System.exit(0);
                break;
            case Greet:
                Cli.cli();
                break;
            case Even:
                Cli.cli();
                Engine.gamePlay(new Even());
                break;
            case Calc:
                Cli.cli();
                Engine.gamePlay(new Calc());
                break;
            case GCD:
                Cli.cli();
                Engine.gamePlay(new GCD());
                break;
            case Progression:
                Cli.cli();
                Engine.gamePlay(new Progression());
                break;
            case Prime:
                Cli.cli();
                Engine.gamePlay(new Prime());
                break;
            default:
                break;
        }
    }
}
