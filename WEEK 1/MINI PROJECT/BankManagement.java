import java.util.*;

public class BankManagement {
    String userName;
    String password;
    int balance;

    public BankManagement(String userName, String password, int balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    public void deposit(int Amount) {
        balance += Amount;
        System.out.println(Amount + "Rs credited to your account");
    }

    public void withdraw(int Amount) {
        if (balance < Amount) {
            System.out.println("Insufficient balance");
        } else {
            balance -= Amount;
            System.out.println(Amount + "Rs debited from your account");
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is :" + balance);
    }

    public static void main(String[] args) {
        BankManagement user1 = new BankManagement("Siva", "123", 4000);
        user1.checkBalance();
        user1.deposit(1230);
        user1.checkBalance();
        user1.withdraw(2048);
        user1.checkBalance();
    }
}