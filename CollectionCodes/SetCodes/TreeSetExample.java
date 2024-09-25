import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();


        numbers.add(10);
        numbers.add(20);
        numbers.add(15);
        numbers.add(5);
        numbers.add(25);
        System.out.println("TreeSet: " + numbers);


        numbers.remove(15);
        System.out.println("After removing 15: " + numbers);

        boolean contains20 = numbers.contains(20);
        System.out.println("Does the TreeSet contain 20? " + contains20);

        System.out.println("Size of TreeSet: " + numbers.size());

        System.out.println("Lowest element: " + numbers.pollFirst());
        System.out.println("Highest element: " + numbers.pollLast());

        TreeSet<Integer> subset = (TreeSet<Integer>) numbers.subSet(10, 25);
        System.out.println("Subset from 10 to 25: " + subset);
    }
}

