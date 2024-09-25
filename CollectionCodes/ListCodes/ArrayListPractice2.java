import java.util.ArrayList;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();


        studentList.add("John");
        studentList.add("Alice");
        studentList.add("Bob");
        studentList.add("Diana");
        studentList.add("Eve");
        System.out.println("Initial student list: " + studentList);


        studentList.add(2, "Charlie");
        System.out.println("After adding Charlie at index 2: " + studentList);


        studentList.remove(1);
        System.out.println("After removing the student at index 1 (Alice): " + studentList);


        studentList.remove("Diana");
        System.out.println("After removing Diana: " + studentList);


        String studentAtIndex3 = studentList.get(3);
        System.out.println("Student at index 3: " + studentAtIndex3);


        studentList.set(0, "Jonathan");
        System.out.println("After updating index 0 (John to Jonathan): " + studentList);


        int listSize = studentList.size();
        System.out.println("Size of student list: " + listSize);


        boolean hasBob = studentList.contains("Bob");
        System.out.println("Does the list contain 'Bob'? " + hasBob);


        int indexOfEve = studentList.indexOf("Eve");
        System.out.println("Index of Eve: " + indexOfEve);


        int indexOfMark = studentList.indexOf("Mark");
        System.out.println("Index of Mark (non-existent): " + indexOfMark);


        studentList.clear();
        System.out.println("After clearing the student list: " + studentList);


        boolean isEmpty = studentList.isEmpty();
        System.out.println("Is the student list empty? " + isEmpty);


        studentList.add("Sophia");
        studentList.add("Liam");
        studentList.add("Olivia");
        studentList.add("Mason");
        System.out.println("New student list: " + studentList);


        ArrayList<String> newStudents = new ArrayList<>();
        newStudents.add("Lucas");
        newStudents.add("Emma");
        newStudents.add("James");
        studentList.addAll(newStudents);
        System.out.println("After adding a group of students: " + studentList);


        studentList.remove("Sophia");
        System.out.println("After removing Sophia: " + studentList);
        System.out.println("Current size of the student list: " + studentList.size());


        studentList.set(2, "Isabella");
        System.out.println("After updating index 2: " + studentList);


        System.out.print("Iterating over the student list: ");
        for (String student : studentList) {
            System.out.print(student + " ");
        }
        System.out.println();


        studentList.remove(0);  
        System.out.println("After removing student at index 0: " + studentList);

        System.out.println("Final size of the student list: " + studentList.size());
    }
}

