package factory.sub;

import factory.Car;
import factory.DiselCar;

public class DieselCarFactory extends AbstractCarFactory {
    @Override
    public Car createCar() {
        return new DiselCar();
    }
}
