package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registration");

        System.out.print("username: ");
        String username = scanner.nextLine();

        System.out.print("password: ");
        String password = scanner.nextLine();

        System.out.println("Registered username: "+username+" / password: "+ password);
    }
}
