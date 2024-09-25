import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamParallelismExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "kiwi", "orange", "fig", "grape", "mango", "papaya");


        List<String> result = fruits.parallelStream()   
                .filter(fruit -> fruit.length() > 3)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Filtered and Processed Fruits (Parallel): " + result);
    }
}

