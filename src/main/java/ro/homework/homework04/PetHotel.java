package ro.homework.homework04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetHotel {
    private Map<Integer, List<Dog>> rooms;

    public PetHotel() {
        rooms = new HashMap<>();
    }

    public void checkIn(int roomNumber, Dog dog) {
        rooms.computeIfAbsent(roomNumber, k -> new ArrayList<>()).add(dog);
    }

    public void checkOut(int roomNumber, Dog dog) {
        List<Dog> dogsInRoom = rooms.get(roomNumber);
        if (dogsInRoom != null) {
            dogsInRoom.remove(dog);
            if (dogsInRoom.isEmpty()) {
                rooms.remove(roomNumber);
            }
        }
    }
    public List<Dog> getDogsInRoom(int roomNumber) {
        return rooms.getOrDefault(roomNumber, new ArrayList<>());
    }


}
