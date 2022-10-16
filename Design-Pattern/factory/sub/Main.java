package factory.sub;

import factory.Car;

public class Main {
    public static void main(String[] args) {

        AbstractCarFactory electricCarFactory = new ElectricCarFactory();
        Car electricCar = electricCarFactory.createCar();
        electricCar.whatIsCar();

        AbstractCarFactory hydrogenCarFactory = new HydrogenCarFactory();
        Car hydrogenCar = hydrogenCarFactory.createCar();
        hydrogenCar.whatIsCar();


        AbstractCarFactory dieselCarFactory = new DieselCarFactory();
        Car dieselCar = dieselCarFactory.createCar();
        dieselCar.whatIsCar();

    }
}
