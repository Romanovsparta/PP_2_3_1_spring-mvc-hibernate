package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
public class CarController {

    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String sayHello(Model model, @RequestParam(value = "count", required = false) Integer count) {
        int number = 5;
        if (count != null && count >= 0 && count <= 5) {
            number = count;
        }
        List<Car> cars = carService.returnListOfCars(Car.cars, number);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
