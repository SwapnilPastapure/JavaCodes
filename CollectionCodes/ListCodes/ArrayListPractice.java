import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("Initial list: " + list);


        list.add(1, "Grapes");
        System.out.println("After adding Grapes at index 1: " + list);


        list.remove(2);
        System.out.println("After removing element at index 2 (Orange): " + list);


        list.remove("Grapes");
        System.out.println("After removing Grapes: " + list);


        list.clear();
        System.out.println("After clearing the list: " + list);


        list.addAll(Arrays.asList("Apple", "Banana", "Orange", "Mango"));
        System.out.println("After adding new elements: " + list);


        String fruit = list.get(2);
        System.out.println("Element at index 2: " + fruit);


        list.set(1, "Pineapple");
        System.out.println("After setting Pineapple at index 1: " + list);

        System.out.println("Size of the list: " + list.size());


        System.out.println("Is the list empty? " + list.isEmpty());


        System.out.println("Does the list contain 'Mango'? " + list.contains("Mango"));


        int index = list.indexOf("Mango");
        System.out.println("Index of Mango: " + index);


        int lastIndex = list.lastIndexOf("Mango");
        System.out.println("Last index of Mango: " + lastIndex);


        Iterator<String> iterator = list.iterator();
        System.out.print("List elements using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


        List<String> subList = list.subList(1, 3);
        System.out.println("Sublist from index 1 to 3: " + subList);


        ArrayList<String> additionalFruits = new ArrayList<>(Arrays.asList("Peach", "Cherry"));
        list.addAll(1, additionalFruits);
        System.out.println("After adding Peach and Cherry at index 1: " + list);


        list.removeAll(additionalFruits);
        System.out.println("After removing Peach and Cherry: " + list);


        ArrayList<String> retainList = new ArrayList<>(Arrays.asList("Banana", "Orange"));
        list.retainAll(retainList);
        System.out.println("After retaining Banana and Orange: " + list);


        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        String[] stringArray = list.toArray(new String[0]);
        System.out.println("String Array: " + Arrays.toString(stringArray));


        list.ensureCapacity(10);
        System.out.println("Capacity ensured to 10");


        list.trimToSize();
        System.out.println("List size trimmed to actual elements");


        System.out.println("Final list: " + list);
    }
}

