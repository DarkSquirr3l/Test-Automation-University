package chapter6;

/* A class to create instances of the rectangle class
 * to find the total area of two rooms.
 */

public class HomeAreaCalculator {

    public static void main(String[] args){

        // ROOM 1
        // create an instance of the rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        //ROOM 2

        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        //calculate area

        double areaTotal = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of the two rooms is: " + areaTotal);
    }
}
