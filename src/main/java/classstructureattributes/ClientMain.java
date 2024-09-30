package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Client contact");

        System.out.print("Client name: ");
        client.name = scanner.nextLine();
        System.out.print("Client year of birth: ");
        client.year = scanner.nextInt();
        System.out.print("Client address: ");
        client.address = scanner.next();

        System.out.println("The registered client is");
        System.out.println("Name:"+client.name);
        System.out.println("Year of birth: "+ client.year);
        System.out.println("Address: "+ client.address);
    }
}
