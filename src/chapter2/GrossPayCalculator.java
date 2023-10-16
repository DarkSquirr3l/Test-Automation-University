package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        //1. Get the number of hours worked.
        System.out.println("Enter the number of hours worked:");
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();

        //2. Get the hourly pay rate.
        System.out.println("Enter the employee's pay rate:");
        double rate = sc.nextDouble();
        sc.close();

        //3. Multiply hours and pay rate
        double tax = 0.2;
        double grossPay = hours * rate;
        double payAfterTax = grossPay - (grossPay * tax);

        //4. Format pay to 2 DP
        DecimalFormat deciForm = new DecimalFormat("0.00");
        String formattedPay = deciForm.format(payAfterTax);

        //5. Display result
        System.out.println("Gross pay = £" + formattedPay);
    }
}
