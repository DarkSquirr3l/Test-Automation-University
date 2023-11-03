package chapter10.challenge;

public class Market {

    public static void main(String[] args) {

        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Banana();
        Apple fruit3 = new Apple();

        fruit1.makeJuice();
        fruit2.makeJuice();
        fruit3.makeJuice();

        ((Banana)fruit2).peel();
        fruit3.slice();
    }
}
