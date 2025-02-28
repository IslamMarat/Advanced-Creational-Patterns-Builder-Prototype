package Prototype;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        // Create a prototype Room
        Room prototypeRoom = new Room("Kitchen", "room for cooking and eating");

        Room cloneRoom1 = prototypeRoom.cloneEntity();
        Room cloneRoom2 = prototypeRoom.cloneEntity();

        cloneRoom2.setName("Bedroom");
        cloneRoom2.setDescription("room for sleeping");

        System.out.println("Prototype Room: " + prototypeRoom);
        System.out.println("Clone Room 1: " + cloneRoom1);
        System.out.println("Clone Room 2: " + cloneRoom2);

        NPC prototypeNPC = new NPC("Villager", "Big Nose", 100);

        NPC cloneNPC1 = prototypeNPC.cloneEntity();
        NPC cloneNPC2 = prototypeNPC.cloneEntity();

        cloneNPC2.setName("Witch");
        cloneNPC2.setHealth(150);

        System.out.println("Prototype NPC: " + prototypeNPC);
        System.out.println("Clone NPC 1: " + cloneNPC1);
        System.out.println("Clone NPC 2: " + cloneNPC2);
    }
}