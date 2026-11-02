package fcc.Actividad20;

/** Parte de una casa en el ejemplo de composición. */
public class Room {
    private final String roomName;

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}
