package chapter3;

// A game where the player has to use change to make the total £1.

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ChallengeMakeAPound {

    public static void main(String[] args) {

        // Create random value to begin game.
        Random random = new Random();
        double randomNumber = random.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedRandom = df.format(randomNumber);
        double formattedRandomDouble = Double.parseDouble(df.format(randomNumber));

        // Begin game
        System.out.println("Enter the change required to make £" + formattedRandom + ", a full pound.");

        // User input
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of one pence pieces:");
        int onePence = sc.nextInt();
        System.out.println("Number of two pence pieces:");
        int twoPence = sc.nextInt();
        System.out.println("Number of five pence pieces:");
        int fivePence = sc.nextInt();
        System.out.println("Number of ten pence pieces:");
        int tenPence = sc.nextInt();
        System.out.println("Number of twenty pence pieces:");
        int twentyPence = sc.nextInt();
        System.out.println("Number of fifty pence pieces:");
        int fiftyPence = sc.nextInt();
        sc.close();

        // Calculation of user total
        double userTotal = onePence * 0.01 + twoPence * 0.02 + fivePence * 0.05
                + tenPence * 0.10 + twentyPence * 0.20 + fiftyPence * 0.50;
        double total = formattedRandomDouble + userTotal;

        // Final check and user feedback
        if (total == 1) {
            System.out.println("Congratulations, you made £1!");
        } else if (total < 1) {
            System.out.println("Oops, too little! Your total is £" + userTotal);
        } else {
            System.out.println("Oops, too much! Your total is £" + userTotal);
        }
    }
}
