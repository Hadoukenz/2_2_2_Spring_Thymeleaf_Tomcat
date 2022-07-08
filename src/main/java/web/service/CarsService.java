package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarsService {

    public static List<Car> showCars(List<Car> cars, Integer amount) {
        try {
            return amount == null ? cars : cars.subList(0, amount);
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            return cars.subList(0, cars.size());
        }
    }
}