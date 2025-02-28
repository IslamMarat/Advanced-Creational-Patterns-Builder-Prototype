package Main;

public class Room implements IGameEntity {
    String name;
    String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void describe() {
        System.out.println("MUD.Room: " + name + " - " + description);
    }
}