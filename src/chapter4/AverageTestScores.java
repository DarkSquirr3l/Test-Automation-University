package chapter4;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        //Process all students
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<numberOfStudents; i++) {
            System.out.println("Student #" + (i+1));

            double total = 0;
            for (int j=0; j<numberOfTests; j++) {
                System.out.println("Enter the score for test #" + (j + 1));
                double score = sc.nextDouble();
                total += score;
            }

            double average = total / numberOfTests;
            System.out.println("Average score for student #" + (i+1) + " is: " + average + ".");
        }
        sc.close();
    }
}
