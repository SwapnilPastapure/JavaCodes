import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class HashSetCodes {

    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();


        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        System.out.println("Initial HashSet: " + fruits);

        fruits.add("Apple");
        System.out.println("After trying to add duplicate (Apple): " + fruits);


        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        boolean containsMango = fruits.contains("Mango");
        System.out.println("Does the HashSet contain Mango? " + containsMango);

        int size = fruits.size();
        System.out.println("Size of the HashSet: " + size);

        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);

        fruits.clear();
        System.out.println("After clearing the HashSet: " + fruits);

        fruits.add("Kiwi");
        fruits.add("Orange");
        fruits.add("Watermelon");
        System.out.println("New HashSet: " + fruits);


        Set<String> moreFruits = new HashSet<>(Arrays.asList("Pineapple", "Strawberry", "Orange"));
        fruits.addAll(moreFruits);
        System.out.println("After adding more fruits: " + fruits);

        Set<String> removeFruits = new HashSet<>(Arrays.asList("Kiwi", "Orange"));
        fruits.removeAll(removeFruits);
        System.out.println("After removing Kiwi and Orange: " + fruits);


        Set<String> retainFruits = new HashSet<>(Arrays.asList("Pineapple", "Watermelon"));
        fruits.retainAll(retainFruits);
        System.out.println("After retaining Pineapple and Watermelon: " + fruits);


        Object[] fruitArray = fruits.toArray();
        System.out.println("HashSet converted to Array: " + Arrays.toString(fruitArray));


        System.out.print("Iterating through the HashSet: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}

