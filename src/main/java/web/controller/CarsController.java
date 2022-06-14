package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.CarsService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String showCars(@RequestParam(required = false) Integer count, Model model) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Nissan", "Silvia S12", 1989));
        cars.add(new Car("Nissan", "Silvia S13", 1990));
        cars.add(new Car("Nissan", "Silvia S14", 1991));
        cars.add(new Car("Nissan", "Silvia S15", 1992));
        cars.add(new Car("Nissan", "GTR", 2009));

        model.addAttribute("carsList", CarsService.showCars(cars, count));
        return "cars";
    }
}