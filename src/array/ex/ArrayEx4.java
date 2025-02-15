package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] students = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            students[i] = scanner.nextInt();
        }
        int total = 0;
        double average = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        average = (double) total / 5;
        System.out.println(total + " " + average);
    }
}
