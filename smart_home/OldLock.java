package smart_home;

public class OldLock implements LegacyLockSystem {
    public void unlock() { System.out.println("Old Lock Unlocked"); }
    public void lock() { System.out.println("Old Lock Locked"); }
}
