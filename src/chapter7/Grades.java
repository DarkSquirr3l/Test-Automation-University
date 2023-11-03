package chapter7;

/*user enters unspecified number of grades
 * program provide average score
 * as well as highest & lowest grades.
 */

import java.util.Scanner;

public class Grades {

    private static int grades[];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades would you like to enter?");
        grades = new int[sc.nextInt()];

        getGrades();
        System.out.println("Average grade: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest grade: " + getHighest());
        System.out.println("Lowest grade: " + getLowest());

        sc.close();
    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i + 1));
            grades[i] = sc.nextInt();
        }
    }

    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public static double calculateAverage() {
        return calculateSum() / grades.length;
    }

    public static int getHighest() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }


    public static int getLowest() {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}