package Main;

import Main.IGameEntity;

public class Item implements IGameEntity {
    String name;
    String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void describe() {
        System.out.println("MUD.Item: " + name + " - " + description);
    }
}