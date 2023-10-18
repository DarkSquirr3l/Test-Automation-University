package chapter4;

import java.util.Scanner;

//WHILE LOOP

public class GrossPayInputValidation {

    public static void main(String[] args) {

        //Initialize known variables
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner sc = new Scanner(System.in);
        double hoursWorked = sc.nextDouble();

        //Validate input
        while (hoursWorked > maxHours && hoursWorked < 1) {
            System.out.println("invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = sc.nextDouble();
        }

        sc.close();

        double gross = hoursWorked * rate;
        System.out.println("Gross pay = £" + gross);
    }
}
