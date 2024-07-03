package at.swd.asus;

import at.swd.Monitor;

public class AsusMonitor implements Monitor {
    @Override
    public void install() {
        System.out.println("Installed ASUS monitor successfully.");
    }
}
