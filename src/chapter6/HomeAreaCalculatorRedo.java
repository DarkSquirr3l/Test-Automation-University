package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        calculator.sc.close();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area of the rooms is: " + area);
    }

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = sc.nextDouble();
        System.out.println("Enter the width of your room:");
        double width = sc.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {

        return rectangle1.calculateArea() * rectangle2.calculateArea();
    }
}
