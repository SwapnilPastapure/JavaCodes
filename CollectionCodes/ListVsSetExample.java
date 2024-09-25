import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSetExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(null);
        list.add(null);
        System.out.println(list.size()+"   Printing list elements"+list);
        list.remove(0);
        System.out.println(list.size()+"   Printing list elements"+list);
        Set<Integer> set= new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(null);
        set.add(null);
        System.out.println(set.size()+ "Printing set elements"+set);
        set.remove(10);
        System.out.println(set.size()+ "Printing set elements"+set);
        set.remove(null);
        System.out.println(set.size()+ "Printing set elements"+set);


    }
}
