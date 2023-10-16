package chapter3;

import java.util.Scanner;

/*
All salespeople get a salary of £1,000 a week.
A £250 bonus is paid for every 10 sales.
 */

public class SalaryCalculator {

    public static void main(String[] args){

        //Initialize know values
        int salary = 1_000;
        int bonus = 250;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        sc.close();

        //Bonus calculation
        if (sales > 9) {
            int totalBonusPayments = sales / 10;
            salary += bonus * totalBonusPayments;
        }
        //Output
        System.out.println("The employee's pay is £" + salary);
    }
}
