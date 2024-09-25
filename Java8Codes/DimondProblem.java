interface A11 {
    default void test() {
        System.out.println("This method of interface A11");
    }
}

//interface B11 {
//    default void test() {
//        System.out.println("This method of interface B11");
//    }
//}


public class DimondProblem implements A11 {
    public static void main(String[] args) {
        DimondProblem dd = new DimondProblem();
        dd.test();
    }



//    @Override
//    public void test() {
//        A11.super.test();
//    }
}
