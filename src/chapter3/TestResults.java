package chapter3;

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {

        // Get the test score
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your score:");
        double testScore = sc.nextDouble();

        sc.close();

        // Determine the letter grade
        char grade;

        if (testScore < 60) {
            grade = 'F';
        } else if (testScore < 70) {
            grade = 'D';
        } else if (testScore < 80) {
            grade = 'C';
        } else if (testScore < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade + ".");
    }
}
