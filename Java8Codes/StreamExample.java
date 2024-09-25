import java.util.*;
//import java.util.function.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        // Sample data
        List<String> list = Arrays.asList("short", "average", "a very long string", "another long one", "tiny", "medium");

        // Stream operations

        // 1. filter
        Stream<String> filteredStream = list.stream().filter(s -> s.length() > 7);
        System.out.println("Filtered Stream: " + filteredStream.collect(Collectors.toList()));

        // 2. map
        Stream<String> mappedStream = list.stream().map(String::toUpperCase);
        System.out.println("Mapped Stream: " + mappedStream.collect(Collectors.toList()));

        // 3. flatMap
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("carrot", "date")
        );
        Stream<String> flatMappedStream = nestedList.stream().flatMap(Collection::stream);
        System.out.println("FlatMapped Stream: " + flatMappedStream.collect(Collectors.toList()));

        // 4. distinct
        List<String> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct List: " + distinctList);

        // 5. sorted
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List: " + sortedList);

        // 6. sorted with comparator
        List<String> sortedWithComparatorList = list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println("Sorted with Comparator List: " + sortedWithComparatorList);

        // 7. peek
        List<String> peekedList = list.stream().peek(System.out::println).collect(Collectors.toList());
        System.out.println("Peeked List: " + peekedList);

        // 8. limit
        List<String> limitedList = list.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited List: " + limitedList);

        // 9. skip
        List<String> skippedList = list.stream().skip(2).collect(Collectors.toList());
        System.out.println("Skipped List: " + skippedList);

        // 10. forEach
        System.out.print("ForEach Output: ");
        list.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        // 11. toArray
        String[] array = list.stream().toArray(String[]::new);
        System.out.println("Array: " + Arrays.toString(array));

        // 12. reduce
        String concatenated = list.stream().reduce("", (a, b) -> a + b);
        System.out.println("Reduced Result: " + concatenated);

        // 13. collect
        List<String> collectedList = list.stream().collect(Collectors.toList());
        System.out.println("Collected List: " + collectedList);

        // 14. min
        Optional<String> min = list.stream().min(Comparator.comparingInt(String::length));
        System.out.println("Min: " + min.orElse("None"));

        // 15. max
        Optional<String> max = list.stream().max(Comparator.comparingInt(String::length));
        System.out.println("Max: " + max.orElse("None"));

        // 16. count
        long count = list.stream().count();
        System.out.println("Count: " + count);

        // 17. anyMatch
        boolean anyMatch = list.stream().anyMatch(s -> s.startsWith("a"));
        System.out.println("Any Match: " + anyMatch);

        // 18. allMatch
        boolean allMatch = list.stream().allMatch(s -> s.length() <= 20);
        System.out.println("All Match: " + allMatch);

        // 19. noneMatch
        boolean noneMatch = list.stream().noneMatch(s -> s.contains("z"));
        System.out.println("None Match: " + noneMatch);

        // 20. findFirst
        Optional<String> first = list.stream().findFirst();
        System.out.println("First Element: " + first.orElse("None"));

        // 21. findAny
        Optional<String> any = list.stream().findAny();
        System.out.println("Any Element: " + any.orElse("None"));

        // 22. iterator
        Iterator<String> iterator = list.stream().iterator();
        System.out.print("Iterator Output: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 23. spliterator
        Spliterator<String> spliterator = list.stream().spliterator();
        System.out.print("Spliterator Output: ");
        spliterator.forEachRemaining(System.out::print);
        System.out.println();

//        // 24. takeWhile
//        List<String> takeWhileList = list.stream().takeWhile(s -> s.length() <= 7).collect(Collectors.toList());
//        System.out.println("TakeWhile List: " + takeWhileList);

//        // 25. dropWhile
//        List<String> dropWhileList = list.stream().dropWhile(s -> s.length() <= 7).collect(Collectors.toList());
//        System.out.println("DropWhile List: " + dropWhileList);

        // 26. of
        Stream<String> streamOf = Stream.of("first", "second", "third");
        System.out.println("Stream.of: " + streamOf.collect(Collectors.toList()));

//        // 27. ofNullable
//        Stream<String> streamOfNullable = Stream.ofNullable("single");
//        System.out.println("Stream.ofNullable: " + streamOfNullable.collect(Collectors.toList()));

    }
}
