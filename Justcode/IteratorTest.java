package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();
        listString.add("ABCD");//0
        listString.add("B");//1
        listString.add("TREEC");//2
        listString.add("DTT");//3
        listString.add("TEE");//4
        listString.add("ABCTD");//0
        listString.add("BOURE");//1
        listString.add("WQWEQWC");//2
        listString.add("GD");//3
        listString.add("E");//4

        for(String ss : listString){
            if(ss.length() >=  5){
                System.out.println("using enhanced for loop "+ss);
            }
        }

        /*Iterator<String> iterator = listString.iterator();
        while (iterator.hasNext()){
            String temp = iterator.next();
            if(temp.length() >= 5){
                System.out.println("print elements using iterator "+temp);
            }
        }*/ //
    }
}
