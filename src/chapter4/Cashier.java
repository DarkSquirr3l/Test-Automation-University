package chapter4;

// FOR LOOP

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {

        //Get the number of items to scan
        System.out.println("Enter the number of items you'd like to scan:");
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();

        double total = 0;

        //Create a loop to iterate through the items and accumulate the costs
        for (int i=0; i < items; i++) {
            System.out.println("Enter the cost of the item:");
            double price = sc.nextDouble();
            total += price;
        }

        sc.close();

        System.out.println("The total for " + items + " items, is £" + total + ".");
    }
}
