package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i=0;;) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int temp = scanner.nextInt();
            scanner.nextLine();

            if (temp == 1) {
                System.out.print("상품 이름을 입력하세요:");
                productNames[i] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요:");
                productPrices[i] = scanner.nextInt();
                i++;
                productCount++;
            }
            if (temp == 2) {
                for (int j = 0; j < productCount; j++) {
                    System.out.println(productNames[j] + ": " + productPrices[j]);
                }
            }
            if (temp == 3) {
                System.out.println("프로그램을을 종료합니다.");

                break;
            }
        }
    }
}
