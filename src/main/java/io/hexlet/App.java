package io.hexlet;

import io.hexlet.code.Engine;
import io.hexlet.games.*;

import java.util.Arrays;
import java.util.Scanner;

public final class App {

    private static void CheckChoice(MenuOption[] options, int choice) {
        if (Arrays.stream(options).allMatch(opt -> opt.getNumber() != choice)) {
            Cli.print("Вы выбрали несуществующую игру :(");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuOption[] options = MenuOption.values();
        Cli.print("Please enter the game number and press Enter.");
        for (MenuOption option : options) {
            Cli.print(option.getNumber() + "-" + option.name());
        }
        int choice = sc.nextInt();
        Cli.print("Your choice: " + choice);
        CheckChoice(options, choice);
        System.out.println("Welcome to the Brain Games!");
        MenuOption option = options[choice];
        switch (option) {
            case Greet -> Cli.greet();
            case Even -> {
                Cli.greet();
                Engine.gamePlay(new Even());
            }
            case Calc -> {
                Cli.greet();
                Engine.gamePlay(new Calc());
            }
            case GCD -> {
                Cli.greet();
                Engine.gamePlay(new GCD());
            }
            case Progression -> {
                Cli.greet();
                Engine.gamePlay(new Progression());
            }
            case Prime -> {
                Cli.greet();
                Engine.gamePlay(new Prime());
            }
            case Exit -> System.exit(0);
        }
    }
}
