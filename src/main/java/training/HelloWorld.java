package training;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String message = "Hello World!";
        System.out.println(message);

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello "+ name + "!");

        System.out.println("Year of birth?");
        int year = scanner.nextInt();
        System.out.println("Year of birth:"+ year);
        System.out.println(2024-year);
    }
}
