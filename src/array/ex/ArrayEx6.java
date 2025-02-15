package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count;
        int max = 0, min = 0;
        count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int temp = scanner.nextInt();
            if (i == 0) {
                min = temp;
                max = temp;
            }
            if(min>temp){
                min = temp;
            }
            if(max <temp){
                max = temp;
            }
        }
        System.out.println(max + " " + min);

    }
}
