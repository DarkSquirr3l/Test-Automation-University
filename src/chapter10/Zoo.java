package chapter10;

public class Zoo {

    public static void main(String[] args){

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Cat felix = new Cat();
        felix.scratch();
        felix.makeSound();
        feed(felix);

        Animal bongo = new Cat();  //POLYMORPHISM
        bongo.makeSound();

        bongo = new Dog();
        bongo.makeSound();
        feed(bongo);

        ((Dog)bongo).fetch(); //POLYMORPHISM - bongo doesn't have direct access to fetch, but can be allowed access
    }

    public static void feed(Animal animal){

        if(animal instanceof Dog){
            System.out.println("Here's your dog food.");
        } else if(animal instanceof Cat){
            System.out.println("Here's your cat food.");
        } else
            System.out.println("Here's your food.");
    }
}
