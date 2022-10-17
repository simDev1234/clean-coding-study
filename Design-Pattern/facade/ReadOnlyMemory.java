package facade;

public class ReadOnlyMemory {
    public Bios getBios() {
        return new Bios();
    }
}
