import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Set;

public class LinkedHashSetCodes {

    public static void main(String[] args) {

        LinkedHashSet<String> fruits = new LinkedHashSet<>();


        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        System.out.println("Initial LinkedHashSet: " + fruits);


        fruits.add("Apple");
        System.out.println("After trying to add duplicate (Apple): " + fruits);


        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);


        boolean containsMango = fruits.contains("Mango");
        System.out.println("Does the LinkedHashSet contain Mango? " + containsMango);


        int size = fruits.size();
        System.out.println("Size of the LinkedHashSet: " + size);

        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the LinkedHashSet empty? " + isEmpty);

        System.out.print("Iterating through the LinkedHashSet: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        fruits.clear();
        System.out.println("After clearing the LinkedHashSet: " + fruits);

        fruits.add("Kiwi");
        fruits.add("Orange");
        fruits.add("Watermelon");
        System.out.println("New LinkedHashSet: " + fruits);

        Set<String> moreFruits = new LinkedHashSet<>(Arrays.asList("Pineapple", "Strawberry", "Orange"));
        fruits.addAll(moreFruits);
        System.out.println("After adding more fruits: " + fruits);

        Set<String> removeFruits = new LinkedHashSet<>(Arrays.asList("Kiwi", "Orange"));
        fruits.removeAll(removeFruits);
        System.out.println("After removing Kiwi and Orange: " + fruits);

        Set<String> retainFruits = new LinkedHashSet<>(Arrays.asList("Pineapple", "Watermelon"));
        fruits.retainAll(retainFruits);
        System.out.println("After retaining Pineapple and Watermelon: " + fruits);

        Object[] fruitArray = fruits.toArray();
        System.out.println("LinkedHashSet converted to Array: " + Arrays.toString(fruitArray));

        System.out.print("First element: ");
        System.out.println(fruitArray.length > 0 ? fruitArray[0] : "No elements");

        System.out.print("Last element: ");
        System.out.println(fruitArray.length > 0 ? fruitArray[fruitArray.length - 1] : "No elements");
    }
}

