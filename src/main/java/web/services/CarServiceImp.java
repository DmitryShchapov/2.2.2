package web.services;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCars() {
        Car car1 = new Car("Honda", "Accord", 5);
        Car car2 = new Car("Lada", "Samara", 2109);
        Car car3 = new Car("MB", "S", 221);
        Car car4 = new Car("Nissan", "AD", 2);
        Car car5 = new Car("Toyota", "Camry", 55);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars;
    }

    @Override
    public List<Car> resultCars(int count) {
        List<Car> cars = getCars();
        List<Car> resultListCars = new ArrayList<>();
        if (count > 0 && count < 5) {
            for (int i = 0; i < count; i++) {
                resultListCars.add(cars.get(i));
            }
        } else if (count >= 5) {
            resultListCars = cars;
        }
        return resultListCars;
    }
}
