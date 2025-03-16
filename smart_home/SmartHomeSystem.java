package smart_home;

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartHomeFactory factory = new BasicSmartHomeFactory();
        SmartHomeController controller = new SmartHomeController();

        Light livingRoomLight = factory.createLight("Living Room");
        Thermostat thermostat = factory.createThermostat();
        Room home = new Room();
        home.addDevice(livingRoomLight);
        home.addDevice(thermostat);

        SmartDevice scheduledLight = new ScheduledOperationDecorator(livingRoomLight);
        controller.addDevice(home);
        controller.addDevice(scheduledLight);

        controller.turnAllOn();
        controller.turnAllOff();

        // Adapter Usage
        LockAdapter smartLock = new LockAdapter(new OldLock());
        smartLock.turnOn();
        smartLock.turnOff();
    }
}
