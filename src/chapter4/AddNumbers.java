package chapter4;

// DO WHILE

import java.util.Scanner;

public class AddNumbers {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean again;

        do {
            System.out.println("Enter the first number:");
            double num1 = sc.nextDouble();

            System.out.println("enter the second number:");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;
            System.out.println("The total is " + sum);

            System.out.println("Would you like to run another calculation, y/n?");
            String yesOrNo = sc.next();

            again = yesOrNo.equals("y") || yesOrNo.equals("yes");

        } while (again);
    }
}
