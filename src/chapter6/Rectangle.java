package chapter6;

public class Rectangle {

    private double length; //private - no other code outside this class can access this
    private double width; //private for encapsulation

    //constructor - must have same name as the class
    //default constructor does not have parameters
    //default constructor assigns default values to the field
    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
