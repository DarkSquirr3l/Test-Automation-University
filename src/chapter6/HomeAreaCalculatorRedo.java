package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    public static void main(String[] args){

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
    }

    public Rectangle getRoom(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of your room:");
        double length = sc.nextDouble();
        System.out.println("Enter the width of your room:");
        double width = sc.nextDouble();

        sc.close();

        return new Rectangle(length, width);
    }
}
