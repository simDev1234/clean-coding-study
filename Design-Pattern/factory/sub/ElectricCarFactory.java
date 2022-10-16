package factory.sub;

import factory.Car;
import factory.ElectricCar;

public class ElectricCarFactory extends AbstractCarFactory {
    @Override
    public Car createCar() {
        return new ElectricCar();
    }
}
