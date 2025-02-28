package Main;

class Merchant extends NPC {
    int gold;
    String[] items;

    public Merchant(String name, String description, int gold, String[] items) {
        super(name, description);
        this.gold = gold;
        this.items = items;
    }

    public void trade() {
        System.out.println(name + " offers items for trade.");
    }

    @Override
    public void describe() {
        System.out.println("MUD.Merchant: " + name + " - " + description + " (Gold: " + gold + ")");
    }
}