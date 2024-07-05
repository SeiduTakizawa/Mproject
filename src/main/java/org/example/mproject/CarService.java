package org.example.mproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CarService {
    private final CarRepository carRepository;
    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    public  List<CarEntity> getCars(){
        return carRepository.findAll();
    }

    public void addCar(CarEntity car){
        Optional<CarEntity> carbyname=carRepository.findByName(car.getName());
        if (carbyname.isPresent()){
            throw new IllegalStateException("Car already exists");
        }
        carRepository.save(car);
    }
    public void deleteCar(Long carId){
        boolean exists = carRepository.existsById(carId);
        if (!exists){
            throw new IllegalStateException("Car does not exist with id "+carId);
        }
        carRepository.deleteById(carId);
    }
}
