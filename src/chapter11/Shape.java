package chapter11;

public abstract class Shape { // can contain implemented methods as well as abstract methods

    abstract double calculateArea();

    public void print(){
        System.out.println("I am the shape.");
    }
}
