package web.service;

import web.model.Car;
import java.util.List;

public interface CarService {
    public List<Car> returnListOfCars(List<Car> cars, int number);
}
