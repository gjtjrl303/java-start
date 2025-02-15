package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);


    }

    public static int deposit(int balance, int money) {
        balance += money;
        System.out.println(money +"원을 입금하였습니다 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int balance, int money) {
        balance -= money;
        System.out.println(money +"원을 출금하였습니다 현재 잔액: " + balance);
        return balance;
    }
}
