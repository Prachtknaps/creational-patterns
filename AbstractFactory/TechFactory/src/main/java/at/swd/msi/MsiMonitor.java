package at.swd.msi;

import at.swd.Monitor;

public class MsiMonitor implements Monitor {
    @Override
    public void install() {
        System.out.println("Installed MSI monitor successfully.");
    }
}
