import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("apple", "banana", "kiwi", "orange", "strawberry");


        List<String> fruitList = stream.collect(Collectors.toList());
        System.out.println("List: " + fruitList);


        Set<String> fruitSet = Stream.of("apple", "banana", "kiwi", "orange", "banana").collect(Collectors.toSet());
        System.out.println("Set: " + fruitSet);

        Map<Integer, String> fruitMap = Stream.of("apple", "banana", "kiwi").collect(Collectors.toMap(String::length, Function.identity()));
        System.out.println("Map: " + fruitMap);

        String concatenated = Stream.of("apple", "banana", "kiwi").collect(Collectors.joining(", "));
        System.out.println("Joined: " + concatenated);

        Map<Integer, List<String>> groupedByLength = Stream.of("apple", "banana", "kiwi", "fig", "grape")
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + groupedByLength);

        Map<Boolean, List<String>> partitioned = Stream.of("apple", "banana", "kiwi", "fig")
                .collect(Collectors.partitioningBy(s -> s.length() > 3));
        System.out.println("Partitioned: " + partitioned);


        long count = Stream.of("apple", "banana", "kiwi").collect(Collectors.counting());
        System.out.println("Count: " + count);


        IntSummaryStatistics stats = Stream.of("apple", "banana", "kiwi").collect(Collectors.summarizingInt(String::length));
        System.out.println("Summary: " + stats);


        Optional<String> concatenatedOptional = Stream.of("apple", "banana", "kiwi")
                .collect(Collectors.reducing((s1, s2) -> s1 + ", " + s2));
        concatenatedOptional.ifPresent(s -> System.out.println("Reduced: " + s));
    }
}
