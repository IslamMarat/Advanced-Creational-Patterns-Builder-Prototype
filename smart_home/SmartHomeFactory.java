package smart_home;

interface SmartHomeFactory {
    Light createLight(String location);
    Thermostat createThermostat();
}
