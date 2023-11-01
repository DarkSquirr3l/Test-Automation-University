package chapter12;

import java.util.*;

public class LoopingCollections {

    public static void main(String[] args) {

       // setDemo();
       // listDemo();
       // queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set<String> fruit = new HashSet<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");

        var i = fruit.iterator(); //works on any collection
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        for(String item: fruit){
            System.out.println(item);
        }

        fruit.forEach(x -> System.out.println(x)); //lambda expression
        fruit.forEach(System.out::println); //concise lambda - for single line iteration, NICE!
    }

    public static void listDemo(){
        List<String> fruits = new ArrayList<>();
        fruits.add("pear");
        fruits.add("peach");
        fruits.add("plum");
        fruits.add("pomegranate");
        fruits.add("plum");
    }

    public static void queueDemo(){
        Queue<String> fruity = new LinkedList<>();
        fruity.add("Fanta");
        fruity.add("Sprite");
        fruity.add("Cherry Pepsi");
        fruity.add("Ribena");
    }

    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 95);
        fruitCalories.put("orange", 45);

        // different methods for Map as it's not technically a collection

        for(var entry: fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach(
                (key,val) -> System.out.println("Fruit: " + key + ", Calories: " + val)
        );
    }
}
