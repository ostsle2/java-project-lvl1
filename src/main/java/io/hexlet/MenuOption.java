package io.hexlet;

/**
 * Start screen menu options.
 * */
public enum MenuOption {
    Exit(0),
    Greet(1),
    Even(2),
    Calc(3),
    GCD(4),
    Progression(5),
    Prime(6);

    private int number;

    public int getNumber() {
        return number;
    }

    MenuOption(int value) {
        this.number = value;
    }
}
