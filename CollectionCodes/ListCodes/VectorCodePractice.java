import java.util.Vector;

public class VectorCodePractice {

    public static void main(String[] args) {

        Vector<String> fruits = new Vector<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        System.out.println("Initial Vector: " + fruits);


        fruits.add(2, "Orange");
        System.out.println("After adding Orange at index 2: " + fruits);


        fruits.remove(3);
        System.out.println("After removing the element at index 3: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);


        String fruitAtIndex1 = fruits.get(1);
        System.out.println("Element at index 1: " + fruitAtIndex1);


        fruits.set(1, "Pineapple");
        System.out.println("After setting Pineapple at index 1: " + fruits);


        int size = fruits.size();
        System.out.println("Size of the Vector: " + size);


        boolean containsMango = fruits.contains("Mango");
        System.out.println("Does the Vector contain Mango? " + containsMango);

        int indexOfApple = fruits.indexOf("Apple");
        System.out.println("Index of Apple: " + indexOfApple);

        fruits.add("Mango");
        int lastIndexOfMango = fruits.lastIndexOf("Mango");
        System.out.println("Last index of Mango: " + lastIndexOfMango);

        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the Vector empty? " + isEmpty);

        fruits.clear();
        System.out.println("After clearing the Vector: " + fruits);

        fruits.add("Kiwi");
        fruits.add("Strawberry");
        fruits.add("Blueberry");
        System.out.println("New Vector: " + fruits);

        System.out.print("Iterating through the Vector: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        fruits.add("Watermelon");
        String firstElement = fruits.firstElement();
        String lastElement = fruits.lastElement();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}

