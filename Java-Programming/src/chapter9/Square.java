package chapter9;

public class Square extends Rectangle{

    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    @Override
    public void print() {
        System.out.println("I am a Square.");
    }
}
