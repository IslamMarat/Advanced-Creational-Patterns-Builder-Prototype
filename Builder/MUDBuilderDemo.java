package Builder;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder
                .setDungeonName("ForsakenLand")
                .addRoom(new Room("CityOfSilver"))
                .addRoom(new Room("MoonCity"))
                .addRoom(new Room("DarkLand"))
                .addNPC(new NPC("Mysterious Adventurer"))
                .addNPC(new NPC("Dark Angel"))
                .build();

        dungeon.displayDungeon();
    }
}