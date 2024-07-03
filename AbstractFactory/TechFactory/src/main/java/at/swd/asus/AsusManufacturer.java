package at.swd.asus;

import at.swd.Company;
import at.swd.Gpu;
import at.swd.Monitor;

public class AsusManufacturer implements Company {
    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }
}
