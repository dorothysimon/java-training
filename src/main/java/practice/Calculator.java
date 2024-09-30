package practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Add two numbers");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me your first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Give me your second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + "+" + secondNumber);
        int result = firstNumber + secondNumber;
        System.out.print(result);
    }
}
