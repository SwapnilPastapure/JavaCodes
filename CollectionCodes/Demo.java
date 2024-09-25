import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {80, 70, 60, 50, 40, 30, 20, 10};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] ss = {"Ram", "Laxman", "Bharat", "Shatrughn"};
        System.out.println(Arrays.toString(ss));
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));
        List<String> Fruits = new ArrayList<>();
        Fruits.add("Mango");
        Fruits.add("Apple");
        Fruits.add("DragenFruits");
        Fruits.add("Banana");
        System.out.println(Fruits);
        Collections.sort(Fruits);
        System.out.println(Fruits);

        ArrayList<Student> al= new ArrayList<Student>();
        al.add(new Student("Swapnil","Pastapure","100"));
        al.add(new Student("Baswraj","Chavale","600"));
        al.add(new Student("Omkar","Pastapure","200"));
        al.add(new Student("Aniket","Chavale","300"));
        al.add(new Student("Shahrukh","Khan","400"));
        al.add(new Student("Salman","Khan","500"));
        Collections.sort(al);
        System.out.println(al);
        for(Student s:al){
            System.out.println(s.FirstName+" " +s.LastName+" " +s.RollNo+" ");
        }
    }
}


 class Student implements Comparable<Student> {
     String FirstName;
     String LastName;
     String RollNo;

     Student(String FirstName, String LastName, String RollNo) {
         this.FirstName = FirstName;
         this.LastName = LastName;
         this.RollNo = RollNo;
     }

     @Override
     public int compareTo(Student ss) {
//          int last = this.LastName.compareTo(ss.LastName);
          int first= this.FirstName.compareTo(ss.FirstName);
          return first;
//          return last;
//       return last ==0 ? this.FirstName.compareTo(ss.FirstName):last;
     }
 }
