package facade;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.turnOn();

//        Power power = new Power();
//
//        if (!power.checkElectric()) {
//            System.out.println("전력이 비정상");
//            return;
//        }
//
//        MainBoard mainboard = new MainBoard();
//        ReadOnlyMemory rom = mainboard.supply(power);
//        Bios bios = rom.getBios();
//
//        if (!bios.post()) {
//            System.out.println("장치가 불량임");
//        }
//
//        BootLoader bootLoader = bios.getBootLoader(rom);
//        HardDiskDrive hdd = new HardDiskDrive();
//
//        OperationSystem os = bootLoader.findOperationSystem(hdd);
//        RandomAccessMemory ram = new RandomAccessMemory();
//        os.bootStrap(ram);

    }
}
