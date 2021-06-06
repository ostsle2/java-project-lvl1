package io.hexlet;
import java.util.Scanner;

public class Cli {

    private static Scanner sc = new Scanner(System.in);

    public static void cli() {
        Cli.print("May I have your name?");
        name = Cli.readLine();
        Cli.print("Hello, " + name);
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static int readNumber() {
        System.out.println("Your answer: ");
        return sc.nextInt();
    }

    public static String readLine() {
        System.out.println("Your answer: ");
        return sc.nextLine();
    }

    private static String name = "";

    public static String getUserName() {
        return name;
    }
}
