import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Creation Methods

        Stream<String> fruitStream = Stream.of("apple", "banana", "kiwi", "orange", "fig", "banana", "grape", "watermelon");


        Stream<String> filteredStream = fruitStream.filter(fruit -> fruit.length() > 4);


        Stream<Integer> lengthStream = filteredStream.map(String::length);


        Stream<Integer> sortedLengthStream = lengthStream.sorted();


        Stream<Integer> distinctLengthStream = sortedLengthStream.distinct();


        Stream<Integer> limitedLengthStream = distinctLengthStream.limit(3);

        List<Integer> lengthList = limitedLengthStream.collect(Collectors.toList());
        System.out.println("Distinct Sorted Lengths (limited to first 3): " + lengthList);

        long count = lengthList.size();
        System.out.println("Count of distinct lengths: " + count);


        Optional<Integer> anyLengthGreaterThanFive = lengthList.stream().filter(length -> length > 5).findAny();
        anyLengthGreaterThanFive.ifPresent(length -> System.out.println("Found a length greater than 5: " + length));


        Optional<Integer> maxLength = lengthList.stream().reduce(Integer::max);
        maxLength.ifPresent(length -> System.out.println("Maximum length: " + length));
    }
}

