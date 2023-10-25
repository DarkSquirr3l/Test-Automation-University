package chapter7;

import java.util.Scanner;

public class ChallengeDayOfTheWeekArray {

    public static String[] daysOfTheWeek = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
    };

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        int userInput = 0;
        boolean askAgain = true;
        while(askAgain) {
            System.out.println("Enter a number corresponding to a day of the week: ");
            userInput = sc.nextInt();
            askAgain = userInput > 7 || userInput < 1;
        }

        sc.close();

        System.out.println(daysOfTheWeek[userInput -1]);

    }
}
