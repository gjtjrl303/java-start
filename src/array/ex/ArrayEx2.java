package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]);
            if (i != 4) {
                System.out.print(", ");
            }
        }
    }
}
