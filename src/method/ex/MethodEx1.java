package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        double result = average(a, b, c);
        System.out.println(result);

    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
