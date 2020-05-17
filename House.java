import java.util.ArrayList;

public class House {

    static House house = new House("");
    String address;
    ArrayList<Room> rooms = new ArrayList<>();
    int roomCount = 0;

    private House(String address) {
        this.address = address;
    }

    public static House newHouse(String address) {
        house.address = address;
        return house;
    }


    void addRoom(Room room) {
        rooms.add(room);
        roomCount++;
    }

    void addRooms(ArrayList<Room> newRooms) {
        for (int i = 0; i < newRooms.size(); i++) {
            rooms.add(newRooms.get(i));
            roomCount++;
        }
    }

    public double getRoomCount() {
        return roomCount;
    }

}