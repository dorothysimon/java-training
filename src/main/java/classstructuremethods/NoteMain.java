package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Note note = new Note();

        System.out.print("Name:");
        note.setName(scanner.nextLine());
        System.out.print("Topic:");
        note.setTopic(scanner.nextLine());
        System.out.print("Text:");
        note.setText(scanner.nextLine());

        System.out.print(note.getNoteText());
    }
}
