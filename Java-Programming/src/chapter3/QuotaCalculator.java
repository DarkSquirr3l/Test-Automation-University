package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        // Initialize values we know.
        int quota = 10;

        // Get unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        sc.close();

        // Make a decision on the path to take
        if (sales >= quota){
            System.out.println("Congrats! You met your quota.");
        } else {
            int salesShort = quota - sales;
            System.out.println("You were " + salesShort + " sales short. :(");
        }
    }
}
