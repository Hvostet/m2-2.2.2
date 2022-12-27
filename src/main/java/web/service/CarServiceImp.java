package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements web.service.CarService {
    private final List<Car> listCars;

    public CarServiceImp() {
        listCars = new ArrayList<>();
        listCars.add(new Car("Avtomobil 1", 1, "number1"));
        listCars.add(new Car("Avtomobil 2", 2, "number2"));
        listCars.add(new Car("Avtomobil 3", 3, "number3"));
        listCars.add(new Car("Avtomobil 4", 4, "number4"));
        listCars.add(new Car("Avtomobil 5", 5, "number5"));
    }

    @Override
    public List<Car> getAllCars() {
        return listCars;
    }

    @Override
    public List<Car> getAmountCars(int amount) {
        return listCars.stream().limit(amount).collect(Collectors.toList());
    }
}
