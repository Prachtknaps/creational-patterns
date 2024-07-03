package at.swd;

import at.swd.asus.AsusManufacturer;
import at.swd.msi.MsiManufacturer;

public class Main {
    public static void main(String[] args) {
        // ASUS
        Company asus = new AsusManufacturer();
        Monitor asusMonitor = asus.createMonitor();
        Gpu asusGpu = asus.createGpu();

        asusMonitor.install();
        asusGpu.install();

        // MSI
        Company msi = new MsiManufacturer();
        Monitor msiMonitor = msi.createMonitor();
        Gpu msiGpu = msi.createGpu();

        msiMonitor.install();
        msiGpu.install();
    }
}