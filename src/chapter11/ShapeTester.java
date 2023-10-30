package chapter11;

public class ShapeTester {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5,10);
        rectangle.print(); //calls method from Shape class
        System.out.println(rectangle.calculateArea());
    }
}
