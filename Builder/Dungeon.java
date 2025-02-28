package Builder;

import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;
    public String getName() {
        return name;
    }
    public List<Room> getRooms() {
        return rooms;
    }
    public List<NPC> getNPCs() {
        return npcs;
    }

    void setName(String name) {
        this.name = name;
    }
    void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
    void setNPCs(List<NPC> npcs) {
        this.npcs = npcs;
    }

    public void displayDungeon() {
        System.out.println(" Dungeon Details ");
        System.out.println("Name: " + name);
        System.out.println("Rooms: "+rooms);
        System.out.println("NPC: " + npcs);
        System.out.println("-----------------");
    }
}