package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade:");
        Scanner sc = new Scanner(System.in);
        String grade = sc.next().toUpperCase();
        sc.close();

        String message;

        switch (grade) {
            case "A" -> message = "Excellent job!";
            case "B" -> message = "Great job!";
            case "C" -> message = "Good job.";
            case "D" -> message = "You need to work a bit harder.";
            case "F" -> message = "Uh-oh!!";
            default -> message = "Error. Invalid grade.";
        }

        System.out.println(message);
    }
}
