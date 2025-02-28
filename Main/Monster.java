package Main;

import Main.NPC;

class Monster extends NPC {
    int health;
    int attack;

    public Monster(String name, String description, int health, int attack) {
        super(name, description);
        this.health = health;
        this.attack = attack;
    }

    public void attack() {
        System.out.println(name + " attacks with power " + attack);
    }

    @Override
    public void describe() {
        System.out.println("MUD.Monster: " + name + " - " + description + " (Health: " + health + ", Attack: " + attack + ")");
    }
}