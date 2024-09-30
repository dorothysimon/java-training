package classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("New client data");

        System.out.print("Client Name: ");
        client.setName(scanner.nextLine());
        System.out.print("Client year: ");
        client.setYear(scanner.nextInt());
        System.out.print("Client Address: ");
        client.setAddress(scanner.next());

        System.out.println("Registered client data");
        System.out.println("Client Name: "+ client.getName());
        System.out.println("Client year: "+ client.getYear());
        System.out.println("Client Address: "+client.getAddress());

        System.out.print("Address has changed. New address: ");
        client.migrate(scanner.next());

        System.out.println("Client Address updated with the new address: "+client.getAddress());

    }
}
