package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Favorite singer/band?");
        song.band = scanner.nextLine();

        System.out.println("What is the title of the song?");
        song.title = scanner.nextLine();

        System.out.println("How long is the music?");
        song.length = scanner.nextInt();

        System.out.printf(song.band+" - "+song.title+" ("+song.length+" min)");

    }
}
