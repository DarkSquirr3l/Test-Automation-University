package chapter5;

import java.util.Scanner;

public class ChallengeCellPhoneBillCalculator {

    //tax method 15%
    public static double taxCalc(double preTaxTotal) {
        double rate = 0.15;
        return preTaxTotal * rate;
    }

    //overage method 25p/minute
    public static double overageCalc(double minutes) {
        double rate = 0.25;
        return rate * minutes;
    }

    //final total
    public static void finalBill(double planFee, double overageMin) {
        double overageCharge = overageCalc(overageMin);
        double preTaxTotal = planFee + overageCharge;
        double taxTotal = taxCalc(preTaxTotal);
        String taxTotal2dp = String.format("%.2f", taxTotal);
        double finalTotal = preTaxTotal + taxTotal;
        String finalTotal2dp = String.format("%.2f", finalTotal);

        System.out.println(" ");
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: £" + planFee);
        System.out.println("Overage: £" + overageCharge);
        System.out.println("Tax: £" + taxTotal2dp);
        System.out.println("Total: £" + finalTotal2dp);
    }

    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plan fee (£):");
        double planFee = sc.nextDouble();
        System.out.println("Enter the overage (min):");
        double overageMin = sc.nextDouble();
        sc.close();
        finalBill(planFee, overageMin);
    }
}
