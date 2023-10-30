package chapter10.challenge;

public class Apple extends Fruit{

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made.");
    }

    public void slice(){
        System.out.println("Apple is sliced.");
    }
}
