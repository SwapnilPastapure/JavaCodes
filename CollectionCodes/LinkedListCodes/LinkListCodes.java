import java.util.LinkedList;

public class LinkListCodes {

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();


        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        System.out.println("Initial LinkedList: " + cities);


        cities.add(2, "San Francisco");
        System.out.println("After adding San Francisco at index 2: " + cities);


        cities.remove(3);
        System.out.println("After removing the element at index 3: " + cities);


        cities.remove("Los Angeles");
        System.out.println("After removing Los Angeles: " + cities);


        String cityAtIndex1 = cities.get(1);
        System.out.println("City at index 1: " + cityAtIndex1);


        cities.set(1, "Seattle");
        System.out.println("After setting Seattle at index 1: " + cities);


        int size = cities.size();
        System.out.println("Size of the LinkedList: " + size);


        boolean containsChicago = cities.contains("Chicago");
        System.out.println("Does the list contain Chicago? " + containsChicago);


        int indexOfChicago = cities.indexOf("Chicago");
        System.out.println("Index of Chicago: " + indexOfChicago);

        cities.add("New York");
        int lastIndexOfNewYork = cities.lastIndexOf("New York");
        System.out.println("Last index of New York: " + lastIndexOfNewYork);


        boolean isEmpty = cities.isEmpty();
        System.out.println("Is the LinkedList empty? " + isEmpty);


        cities.clear();
        System.out.println("After clearing the LinkedList: " + cities);

        cities.add("Boston");
        cities.add("Miami");
        cities.add("Dallas");
        System.out.println("New LinkedList: " + cities);

        System.out.print("Iterating through the LinkedList: ");
        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();

        cities.add("Denver");
        String firstCity = cities.get(0);
        String lastCity = cities.get(cities.size() - 1);
        System.out.println("First city: " + firstCity);
        System.out.println("Last city: " + lastCity);
    }
}

