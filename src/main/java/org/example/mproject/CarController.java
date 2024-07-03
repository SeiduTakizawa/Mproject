package org.example.mproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "car")
public class CarController {
    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping
    public List<CarEntity> getCars(){
        return carService.getCars();
    }
    @PostMapping
    public void registerCar(@RequestBody CarEntity car){
        carService.addCar(car);
    }
}
