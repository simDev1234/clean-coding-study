package facade;

public class Bios {
    public boolean post() {
        return true;
    }

    public BootLoader getBootLoader(ReadOnlyMemory rom) {
        return new BootLoader();
    }
}
