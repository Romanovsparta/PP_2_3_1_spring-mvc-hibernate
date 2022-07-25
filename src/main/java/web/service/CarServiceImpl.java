package web.service;

import web.model.Car;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> returnListOfCars(List<Car> cars, int number) {
        return cars.subList(0, number);
    }
}
