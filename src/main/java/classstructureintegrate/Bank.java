package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("AccountNumber: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Owner: ");
        String owner = scanner.nextLine();
        System.out.print("Balance: ");
        int balance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);
        System.out.println(bankAccount.getInfo());

        System.out.print("Withdraw: ");
        bankAccount.withdraw(scanner.nextInt());
        System.out.println(bankAccount.getInfo());

        System.out.print("Deposit: ");
        bankAccount.deposit(scanner.nextInt());
        System.out.println(bankAccount.getInfo());
    }
}
