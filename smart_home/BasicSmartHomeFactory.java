package smart_home;

public class BasicSmartHomeFactory implements SmartHomeFactory {
    public Light createLight(String location) { return new Light(location); }
    public Thermostat createThermostat() { return new Thermostat(); }
}
