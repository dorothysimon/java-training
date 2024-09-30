package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Store cakeStore = new Store("Cake");
        Store coffeeStore = new Store("Coffee");

        Scanner scanner = new Scanner(System.in);

        System.out.print(cakeStore.getProduct() + " Store. Incoming product quantity: ");
        cakeStore.store(scanner.nextInt());
        System.out.print(coffeeStore.getProduct() + " Store. Incoming product quantity: ");
        coffeeStore.store(scanner.nextInt());

        System.out.println(cakeStore.getProduct() + " Store. Current quantity: " + cakeStore.getStock());
        System.out.println(coffeeStore.getProduct() + " Store. Current quantity: " + coffeeStore.getStock());

        System.out.print(cakeStore.getProduct() + " Store. Delivered quantity: ");
        cakeStore.dispatch(scanner.nextInt());
        System.out.print(coffeeStore.getProduct() + " Store. Delivered quantity: ");
        coffeeStore.dispatch(scanner.nextInt());

        System.out.println(cakeStore.getProduct() + " Store. Current quantity: " + cakeStore.getStock());
        System.out.println(coffeeStore.getProduct() + " Store. Current quantity: " + coffeeStore.getStock());
    }
}
