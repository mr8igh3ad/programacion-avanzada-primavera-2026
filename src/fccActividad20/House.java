package fcc.Actividad20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Composición: la casa crea y administra internamente sus habitaciones.
 * Se devuelven nombres, no la colección modificable de habitaciones.
 */
public class House {
    private final String houseName;
    private final List<Room> rooms;

    public House(String houseName) {
        this.houseName = houseName;
        this.rooms = new ArrayList<>();
    }

    public String getHouseName() {
        return houseName;
    }

    public void addRoom(String roomName) {
        rooms.add(new Room(roomName));
    }

    public int getTotalRooms() {
        return rooms.size();
    }

    public List<String> getRoomNames() {
        List<String> roomNames = new ArrayList<>();
        for (Room room : rooms) {
            roomNames.add(room.getRoomName());
        }
        return Collections.unmodifiableList(roomNames);
    }
}
