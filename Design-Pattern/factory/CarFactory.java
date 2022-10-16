package factory;

public class CarFactory {

    public Car createCar(EngineType engineType) {

        if (engineType.isElectric()) {
            return new ElectricCar();
        }

        if (engineType.isHydrogen()) {
            return new HydrogenCar();
        }

        if (engineType.isDiesel()) {
            return new DiselCar();
        }

        throw new RuntimeException("일치하는 차가 없습니다.");
    }

}
