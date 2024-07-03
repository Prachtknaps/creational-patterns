package at.swd.msi;

import at.swd.Gpu;

public class MsiGpu implements Gpu {
    @Override
    public void install() {
        System.out.println("Installed MSI GPU successfully.");
    }
}
