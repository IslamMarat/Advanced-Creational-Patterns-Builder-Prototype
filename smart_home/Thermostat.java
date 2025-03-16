package smart_home;

class Thermostat implements SmartDevice {
    public void turnOn() { System.out.println("Thermostat is set to comfort mode"); }
    public void turnOff() { System.out.println("Thermostat is off"); }
}
