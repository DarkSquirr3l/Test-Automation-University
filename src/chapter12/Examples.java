package chapter12;

import java.util.*;

public class Examples {

    public static void main(String[] args) {

        // Set - unordered & unique elements
        // https://docs.oracle.com/javase/8/docs/api/java/util/Set.html

        Set<String> fruit = new HashSet<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");

        System.out.println(fruit.size());
        System.out.println(fruit);

        /* Methods
         * add - adds an object
         * clear - removes all objects
         * contains - returns a boolean if an element is in the collection
         * isEmpty - return boolean if the collection has no elements
         * iterator - returns an iterator object for the collection which may be used to retrieve an object
         * remove - removes a specified object
         * size - returns the number of elements in the collection
         */

        // Lists - ordered no unique requirement
        // https://docs.oracle.com/javase/8/docs/api/java/util/List.html

        List<String> fruits = new ArrayList<>();
        fruits.add("pear");
        fruits.add("peach");
        fruits.add("plum");
        fruits.add("pomegranate");
        fruits.add("plum");

        System.out.println(fruits.get(1));
        System.out.println(fruits.size());
        System.out.println(fruits);

        /* Methods
         * add(int index, Object obj)
         * addAll(int index, Collection c)
         * get(int index)
         * indexOf(Object obj)
         * lastIndexOf(Object obj)
         * listIterator(), listIterator(int Index) - returns the index of the las instance of obj in the list.
         * remove(int index)
         * set(int index, Object obj) - assigns obj to the location specified by index within the invoking list
         * subList(int start, int end) - returns a list containing elements from start to end
         */

        // Queue's - ordered elements for processing - first in first out
        // https://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html

        Queue<String> fruity = new LinkedList<>();
        fruity.add("Fanta");
        fruity.add("Sprite");
        fruity.add("Cherry Pepsi");
        fruity.add("Ribena");

        System.out.println(fruity.size());
        System.out.println(fruity);

        fruity.remove();
        System.out.println(fruity);
        System.out.println(fruity.peek());

        /* Methods
         * add - adds to the tail of the queue
         * peek - view the head of the queue, returns false if queue empty
         * element - similar to peek but throws exception if queue is empty
         * remove - removes and returns head of the queue
         * poll - similar to remove but returns null if queue is empty
         */

        // Map - unordered unique key-value pairs
        // https://docs.oracle.com/javase/9/docs/api/java/util/Map.html

        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 95);
        fruitCalories.put("orange", 45);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);
        System.out.println(fruitCalories.entrySet());

        /* Methods
         * clear - removes all key value pairs
         * containsKey(Object Key)
         * containsValue(Object value)
         * entrySet - returns a set that contains the entries in the map
         * get(object Key) - returns value for key
         * isEmpty - returns true if map is empty
         * keyset - returns a set that contains the keys
         * put(Object key, Object value) - inserts key value pair, overwriting previous value if duplicate key
         * putAll(Map m) - inserts map m
         * putIfAbsent(Object key, Object value) - puts entry in the map if key does not exist
         * remove(object key) - removes entry whose key equals 'key'
         */

        // Instead of using add these collections can be created more efficiently

        List<String> unchangeableList = List.of("apple", "lemon", "banana");

        // However will not be able to use add and remove methods...
    }
}
