package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productString = "Product: ";
        String priceString = " Price: ";

        System.out.print("Product name: ");
        String name = scanner.nextLine();
        System.out.print("Price of " + name + ": ");
        int price = scanner.nextInt();

        Product coffee = new Product(name, price);

        System.out.println(productString + coffee.getName() + priceString+ coffee.getPrice());

        System.out.print("Decrease price with: ");
        coffee.decreasePrice(scanner.nextInt());

        System.out.println(productString + coffee.getName() + priceString+ coffee.getPrice());

        System.out.print("Increase price with: ");
        coffee.increasePrice(scanner.nextInt());

        System.out.println(productString + coffee.getName() + priceString+ coffee.getPrice());

    }
}
