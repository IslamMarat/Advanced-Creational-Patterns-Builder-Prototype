package smart_home;

class ScheduledOperationDecorator extends DeviceDecorator {
    public ScheduledOperationDecorator(SmartDevice device) { super(device); }
    public void turnOn() { System.out.println("Scheduled Task: Turning on device"); super.turnOn(); }
}
