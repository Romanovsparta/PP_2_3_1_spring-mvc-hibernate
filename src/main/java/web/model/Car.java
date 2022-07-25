package web.model;

import java.util.Arrays;
import java.util.List;

public class Car {
    private String brand;
    private String model;
    private String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nМарка = " + brand +
                "\nМодель = " + model +
                "\nЦвет = " + color;
    }

    public static List<Car> cars = Arrays.asList(
            new Car("Tesla", "Model S", "white"),
            new Car("Buick", "Riviera", "azure"),
            new Car("Cadillac", "Seville", "red"),
            new Car("Oldsmobile", "Starfirevia", "red & white"),
            new Car("BMW", "Z8", "blue")
    );
}
