package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(String name, int width, int length){
        MeetingRoom room = new MeetingRoom(name, width, length);
        meetingRooms.add(room);
    }

    public List<MeetingRoom> getMeetingRooms(){
            return meetingRooms;
    }

    public List<MeetingRoom> getMeetingRoomsInReverseOrder(){
        List<MeetingRoom> result = new ArrayList<>();
        for (int i = (meetingRooms.size()-1) ; i >= 0; i--){
            result.add(meetingRooms.get(i));
        }
        return result;
    }

    public List<MeetingRoom> getEverySecondMeetingRoom(int index){
        List<MeetingRoom> result = new ArrayList<>();
        if (index == 1){
            for (int i = 0; i < meetingRooms.size(); i = i + 2){
                result.add(meetingRooms.get(i));
            }
        }
        if (index == 2) {
            for (int i = 1; i < meetingRooms.size(); i = i + 2) {
                result.add(meetingRooms.get(i));
            }
        }
        return result;
    }

    public MeetingRoom getMeetingRoomWithGivenName(String name){
        for (MeetingRoom room: meetingRooms){
            if(room.getName().equals(name)){
                return room;
            }
        }
        return null;
    }

    public List<MeetingRoom> getMeetingRoomsWithGivenNamePart(String namePart){
        List<MeetingRoom> result = new ArrayList<>();
        for (MeetingRoom room: meetingRooms){
            if(room.getName().contains(namePart)){
                result.add(room);
            }
        }
        return result;
    }

    public List<MeetingRoom> getMeetingRoomsWithAreaLargerThan(int area){
        List<MeetingRoom> result = new ArrayList<>();
        for (MeetingRoom room: meetingRooms){
            if(room.getArea() > area){
                result.add(room);
            }
        }
        return result;
    }

}
