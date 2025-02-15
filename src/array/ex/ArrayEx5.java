package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int[] students = new int[index];

        for (int i = 0; i < students.length; i++) {
            students[i] = scanner.nextInt();
        }
        int total = 0;
        double average = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        average = (double) total / index;
        System.out.println(total + " " + average);
    }
}
