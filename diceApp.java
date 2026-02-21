// Program name: diceApp.java
// Grant Dresser
// 2/20/2026

import java.util.Scanner;
import java.util.Random;

public class diceApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String choice = "yes";

        // while loop to keep rolling
        while (choice.equalsIgnoreCase("yes")) {

            // roll two dice (1–6)
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;

            int sum = die1 + die2;

            // display the results
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            // ask user to roll the dice again
            System.out.print("Roll the dice again? Please type yes/no: ");
            choice = input.next();
        }

        System.out.println("Thank you for playing!");

        input.close();
    }
}