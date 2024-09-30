package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String name = scanner.nextLine();
        System.out.print("Price of " + name + ": ");
        int price = scanner.nextInt();

        Product coffee = new Product(name, price);

        System.out.println("Product: " + coffee.getName() + " Price: "+ coffee.getPrice());

        System.out.print("Decrease price with: ");
        coffee.decreasePrice(scanner.nextInt());

        System.out.println("Product: " + coffee.getName() + " Price: "+ coffee.getPrice());

        System.out.print("Increase price with: ");
        coffee.increasePrice(scanner.nextInt());

        System.out.println("Product: " + coffee.getName() + " Price: "+ coffee.getPrice());

    }
}
