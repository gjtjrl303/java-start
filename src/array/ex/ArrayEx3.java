package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = numbers.length - 1; i >= 0; --i) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }


    }
}
