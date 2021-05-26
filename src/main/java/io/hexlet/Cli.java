package io.hexlet;
import java.util.Scanner;

public class Cli {
    public static void cli() {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
