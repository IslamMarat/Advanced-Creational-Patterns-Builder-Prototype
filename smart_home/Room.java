package smart_home;

import java.util.ArrayList;
import java.util.List;

public class Room implements SmartDevice {
    private List<SmartDevice> devices = new ArrayList<>();
    public void addDevice(SmartDevice device) { devices.add(device); }
    public void turnOn() { devices.forEach(SmartDevice::turnOn); }
    public void turnOff() { devices.forEach(SmartDevice::turnOff); }
}
