package at.swd.asus;

import at.swd.Gpu;

public class AsusGpu implements Gpu {
    @Override
    public void install() {
        System.out.println("Installed ASUS GPU successfully.");
    }
}
