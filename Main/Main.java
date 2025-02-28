package Main;

public class Main {
    public static <Door> void main(String[] args) throws InterruptedException {
        Room room = new Room("Dungeon", "A dark and scary place");
        Monster monster = new Monster("Orc", "A fearsome green creature", 100, 15);
        Merchant merchant = new Merchant("Trader Joe", "A friendly merchant", 50, new String[]{"Potion", "Sword"});
        Item item = new Item("Magic Sword", "A legendary blade with magical powers");
        Door door = new Door(true, "Next Level", "A heavy iron door");

        room.describe();
        monster.describe();
        monster.attack();
        merchant.describe();
        merchant.trade();
        item.describe();
        door.toString();
        door.wait();
        door.toString();
    }
}
