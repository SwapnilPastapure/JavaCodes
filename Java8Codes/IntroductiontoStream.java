import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntroductiontoStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Test");
        list.add("Testtttt");
        list.add("Test5566");
        list.add("Test12345");
        list.add("Test12345678");

        List<String> result = list.stream().distinct().filter(s-> s.length()>9).collect(Collectors.toList());
        System.out.println("Original List "+list);
        System.out.println("After performing operation on list "+result);
    }
}
