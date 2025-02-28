package Main;

class NPC implements IGameEntity {
    String name;
    String description;

    public NPC(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void describe() {
        System.out.println("MUD.NPC: " + name + " - " + description);
    }
}