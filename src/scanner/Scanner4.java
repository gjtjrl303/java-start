package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("문자를 입력하세요:");
            String str = scanner.nextLine();
            if(str.equals("exit")){
                break;
            }
            System.out.println("입력한 문자열:" + str);
        }
    }
}
