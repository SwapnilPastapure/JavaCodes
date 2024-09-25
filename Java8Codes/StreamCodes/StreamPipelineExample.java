import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipelineExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "kiwi", "orange", "fig", "grape");


        List<String> result = fruits.stream()
                .filter(fruit -> fruit.length() > 3)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Filtered and Processed Fruits: " + result);
    }
}

