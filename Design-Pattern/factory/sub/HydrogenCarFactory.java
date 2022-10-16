package factory.sub;

import factory.Car;
import factory.ElectricCar;
import factory.HydrogenCar;

public class HydrogenCarFactory extends AbstractCarFactory {
    @Override
    public Car createCar() {
        return new HydrogenCar();
    }
}
