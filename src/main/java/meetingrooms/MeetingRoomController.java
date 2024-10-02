package meetingrooms;

import java.util.List;
import java.util.Scanner;

public class MeetingRoomController {
    private Office office = new Office();
    private Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {
        MeetingRoomController controller = new MeetingRoomController();
        controller.runMenu();
    }

    public void runMenu(){
        System.out.print("How many meeting rooms you will register?: ");
        int meetingRooms = scanner.nextInt();
        readMeetingRooms(meetingRooms);
        printMenu();
        System.out.print("I choose: ");
        int menuNumber = scanner.nextInt();
        runChosenMenu(menuNumber);
    }

    public void printMenu(){
        System.out.println("""
                Which menu would choose?
                1. Meeting rooms in order
                2. Meeting rooms in reverse order
                3. Every second meeting room
                4. Meeting rooms areas
                5. Meeting rooms with given name
                6. Meeting rooms with given namePart
                7. Meeting rooms by areas
                8. Quit
                """);
    }

    public void readMeetingRooms(int meetingRooms){
        for (int i = 0; i < meetingRooms; i++){
            System.out.print(i + ". meeting room name: ");
            String meetingRoomName = scanner.next();
            System.out.print(i + ". meeting room width: ");
            int meetingRoomWidth = scanner.nextInt();
            System.out.print(i + ". meeting room length: ");
            int meetingRoomLength = scanner.nextInt();
            office.addMeetingRoom(meetingRoomName, meetingRoomWidth, meetingRoomLength);
        }
    }

    public void runChosenMenu(int menuNumber){
        if (menuNumber == 1){
             System.out.println("Meeting rooms in order: ");
             printNames(office.getMeetingRooms());
        }

        if (menuNumber == 2){
            System.out.println("Meeting rooms in reverse order: ");
            printNames(office.getMeetingRoomsInReverseOrder());
        }

        if (menuNumber == 3){
            System.out.print("Odd(1) or Even(2) indexes?: ");
            int index = scanner.nextInt();
            System.out.println("Every second meeting room: ");
            printNames(office.getEverySecondMeetingRoom(index));
        }

        if (menuNumber == 4){
            System.out.println("Meeting rooms with areas: ");
            printMeetingRooms(office.getMeetingRooms());
        }

        if (menuNumber == 5){
            System.out.print("Meeting room with given name: ");
            String meetingRoomName = scanner.next();
            printRoom(office.getMeetingRoomWithGivenName(meetingRoomName));
        }

        if (menuNumber == 6){
            System.out.print("Meeting room with partial name: ");
            String meetingRoomName = scanner.next();
            printMeetingRooms(office.getMeetingRoomsWithGivenNamePart(meetingRoomName));
        }
        if (menuNumber == 7){
            System.out.print("Meeting room area larger than: ");
            int area = scanner.nextInt();
            printMeetingRooms(office.getMeetingRoomsWithAreaLargerThan(area));
        }
        if (menuNumber == 8){
            System.out.print("Good bye!");
        }
        if (menuNumber < 1 || menuNumber > 8){
            System.out.print("Menu number not known!");
        }

    }

    public void printNames(List<MeetingRoom> meetingRooms){
        for (MeetingRoom room: meetingRooms){
            System.out.println(room.getName());
        }
    }

    public void printMeetingRooms(List<MeetingRoom> meetingRooms){
        for (MeetingRoom room: meetingRooms){
            printRoom(room);
        }
    }
    public void printRoom(MeetingRoom room){
        if (room != null){
            System.out.println("Meeting room found ");
            System.out.println("Meeting room name: " + room.getName() + ", Width: "+ room.getWidth() +
                    ", Length: " + room.getLength() + ", Area: " + room.getArea());
        }
    }
}
