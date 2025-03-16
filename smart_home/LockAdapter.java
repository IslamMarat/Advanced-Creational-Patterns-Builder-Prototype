package smart_home;

public class LockAdapter implements SmartDevice {
    private LegacyLockSystem legacyLock;
    public LockAdapter(LegacyLockSystem lock) { this.legacyLock = lock; }
    public void turnOn() { legacyLock.unlock(); }
    public void turnOff() { legacyLock.lock(); }
}
