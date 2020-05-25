package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private static CarService carService;

    public static CarService getCarService() {
        if (carService == null) {
            carService = new CarService();
        }
        return carService;
    }

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "M3", 1995));
        cars.add(new Car("Toyota", "Mark II", 1993));
        cars.add(new Car("VAZ", "Priora", 2006));
        cars.add(new Car("VW", "SomeCar", 2018));
        return cars;
    }
}
