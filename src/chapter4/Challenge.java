package chapter4;

import java.util.Random;
import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        // Initialise known values.
        int numberOfSpaces = 21;
        int numberOfRolls = 5;
        int diceMax = 6;
        int dealerMax = 16;
        double userBalance = 100;
        int win = 2;
        double blackJack = 2.5;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // Begin game
        System.out.println("Welcome to Black Jack dice. Make it to 21 in 5 rolls to beat the dealer.");

        while (true) {
            if (userBalance <= 0) {
                System.out.println("Insufficient funds, please deposit more to continue playing.");
            }

            //Set up variables and take user bet.
            double bet;
            while (true) {
                System.out.println("Place your bets (Balance: £" + userBalance + ").");
                bet = sc.nextDouble();
                if (bet > userBalance) {
                    System.out.println("Insufficient funds.");
                } else {
                    userBalance -= bet;
                    break;
                }
            }

            int userTotal = 0;
            int dealerTotal = 0;

            //User dice rolls
            for (int i = 0; i < numberOfRolls; i++) {
                int die = random.nextInt(diceMax) + 1;
                userTotal += die;
                System.out.println("You rolled a " + die + ".");
                System.out.println("Your TOTAL is " + userTotal + ". You have " + (numberOfRolls - i - 1) + " rolls left.");

                if (userTotal > numberOfSpaces || userTotal == numberOfSpaces || i == (numberOfRolls - 1)) {
                    break;
                }

                System.out.println("Would you like to roll again? (y/n).");
                String cont = sc.next();

                if (!cont.equals("y")) {
                    break;
                }
            }

            //Dealer dice rolls
            if (userTotal < numberOfSpaces) {
                for (int i = 0; i < numberOfRolls; i++) {
                    int die = random.nextInt(diceMax) + 1;
                    dealerTotal += die;
                    System.out.println("The dealer rolled " + die + ".");
                    System.out.println("The dealers total is " + dealerTotal + ".");
                    if (dealerTotal >= dealerMax) {
                        break;
                    }
                }
            }

            //Result
            if (userTotal > numberOfSpaces) {
                System.out.println("You are BUST!");
            } else if (userTotal == 21) {
                System.out.println("BLACKJACK! You won £" + (bet * blackJack) +".");
                userBalance += (bet * blackJack);
            } else if (dealerTotal > userTotal) {
                System.out.println("You lost :(.");
            } else if (dealerTotal == userTotal) {
                System.out.println("It's a tie, you won £" + bet + ".");
                userBalance += bet;
            } else {
                System.out.println("You're a winner! You won £" + (bet * win) + ".");
                userBalance += bet * win;
            }

            //Play again...
            System.out.println("Would you like to play again? (y/n) (Balance: £" + userBalance + ").");
            String cont = sc.next();
            if (!cont.equals("y")) {
                break;
            }
        }
    }
}
