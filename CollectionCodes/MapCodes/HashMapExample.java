import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> fruitMap = new HashMap<>();
        HashMap<String, Integer> anotherFruitMap = new HashMap<>(10); // Initial capacity
        HashMap<String, Integer> loadedFruitMap = new HashMap<>(10, 0.75f);


        fruitMap.put("Apple", 3);
        fruitMap.put("Banana", 2);
        fruitMap.put("Orange", 5);
        fruitMap.put("Grape", 4);


        System.out.println("Size of fruitMap: " + fruitMap.size());


        System.out.println("Number of Apples: " + fruitMap.get("Apple"));


        System.out.println("Contains Banana? " + fruitMap.containsKey("Banana"));


        System.out.println("Contains 5? " + fruitMap.containsValue(5));


        fruitMap.remove("Banana");
        System.out.println("After removing Banana, size: " + fruitMap.size());


        System.out.println("Fruits available:");
        for (String fruit : fruitMap.keySet()) {
            System.out.println(fruit + ": " + fruitMap.get(fruit));
        }


        System.out.println("Number of fruits available:");
        for (Integer quantity : fruitMap.values()) {
            System.out.println(quantity);
        }


        System.out.println("Fruit entries:");
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        anotherFruitMap.put("Pineapple", 6);
        anotherFruitMap.put("Mango", 7);
        fruitMap.putAll(anotherFruitMap);
        System.out.println("After adding anotherFruitMap, size: " + fruitMap.size());


        fruitMap.replace("Orange", 8);
        System.out.println("Updated number of Oranges: " + fruitMap.get("Orange"));


        boolean isRemoved = fruitMap.remove("Apple", 3);
        System.out.println("Was Apple removed? " + isRemoved);
        System.out.println("Size after removing Apple: " + fruitMap.size());


        boolean isReplaced = fruitMap.replace("Grape", 4, 5);
        System.out.println("Was Grape replaced? " + isReplaced);
        System.out.println("Updated number of Grapes: " + fruitMap.get("Grape"));


        fruitMap.clear();
        System.out.println("After clearing, size: " + fruitMap.size());
    }
}

