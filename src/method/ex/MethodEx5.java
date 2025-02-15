package method.ex;

import java.util.Scanner;

public class MethodEx5 {

    public static void main(String[] args) {

        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int i = scanner.nextInt();
            if(i ==1){
                System.out.print("입금액을 입력하세요: ");
                int amount = scanner.nextInt();
                balance = deposit(balance, amount);
            } else if (i == 2) {
                System.out.print("출금액을 입력하세요: ");
                int amount = scanner.nextInt();
                balance = withdraw(balance, amount);
            } else if (i == 3) {
                printAmount(balance);
            } else {
                break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("------------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("------------------------------------");
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance);
        }else{
            System.out.println(amount+"원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    public static void printAmount(int balance){
        System.out.println("현재 잔액: " + balance + "원");
    }
}


