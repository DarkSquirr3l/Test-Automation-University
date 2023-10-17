package chapter3;

/*
 * NESTED IFS
 * To qualify for a loan, a person must make £30k+
 * and have been working at their current job for 2+ years/
 */

import java.util.Scanner;

public class LoanQualifier {

    public static void main (String[] args) {

        // Initialise what we know.
        int requiredSalary = 30_000;
        int requiredYears = 2;

        // Get what we don't know
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter the number of years at your current job:");
        double years = sc.nextDouble();

        sc.close();

        // Make decision
        if (salary >= requiredSalary) {
            if (years >= requiredYears) {
                System.out.println("You qualify for the loan :D.");
            } else {
                System.out.println("Sorry, you need to have been with your current employer for longer.");
            }
        } else {
            System.out.println("Sorry, you don't make enough money to afford this loan.");
        }
    }
}
