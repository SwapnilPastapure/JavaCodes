package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
/*Map does not allow duplicate Keys.
We can enter duplicate Values in Map.
Map allows only 1 null as Key in Map.*/

public class HashMapIntro {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 100);
        hashMap.put("Java1", 100);
        hashMap.put("Java2", 100);
        hashMap.put("JavaT", 100);
        hashMap.put(null, 100);
        System.out.println(" Before adding duplicate key "+hashMap.get(null));
        hashMap.put(null, 300); //When we enter duplicate key in HashMap, it will override the previous value.
        hashMap.put(null, 90);
        System.out.println(" After adding duplicate key "+hashMap.get(null)); //90

        hashMap.put("Java", 888);
        Integer vv = hashMap.get("Java");
        System.out.println(vv); //

        System.out.println(hashMap.size());  //


    }
}
