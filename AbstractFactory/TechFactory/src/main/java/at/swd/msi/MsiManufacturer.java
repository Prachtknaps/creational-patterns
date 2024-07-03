package at.swd.msi;

import at.swd.Company;
import at.swd.Gpu;
import at.swd.Monitor;

public class MsiManufacturer implements Company {
    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }
}
