interface L {
    int addition(int a, int b, int c);
}

public class LambdaWithint {
    public static void main(String[] args) {
        L obj = (int aa, int bb, int cc) -> {
            int d = aa + bb + cc;
            return d;
        };
        int a = obj.addition(10, 20, 30);
        System.out.println("The addition of three numbers is  " + a);
    }
}