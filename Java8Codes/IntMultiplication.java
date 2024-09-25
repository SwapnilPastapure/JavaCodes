interface f {
    int multiplication(int a, int b, int c);

}

public class IntMultiplication {
    public static void main(String[] args) {
        f obj = (int mm, int ss, int pp) -> {
            int d = mm * ss * pp;
            return d;
        };
        int a = obj.multiplication(10, 20, 30);
        System.out.println("Addition of three no. " + a);
    }
}
