package com.robgro.servicestation.services.springdatajpa;

import com.robgro.servicestation.model.Car;
import com.robgro.servicestation.repositories.CarRepository;
import com.robgro.servicestation.services.CarService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class CarSDJpaService implements CarService {

    private final CarRepository carRepository;

    public CarSDJpaService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Set<Car> findAll() {
        Set<Car> cars = new HashSet<>();
        carRepository.findAll().forEach(cars::add);
        return cars;
    }

    @Override
    public Car findById(Long aLong) {
        return carRepository.findById(aLong).orElse(null);
    }

    @Override
    public Car save(Car object) {
        return carRepository.save(object);
    }

    @Override
    public void delete(Car object) {
        carRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        carRepository.deleteById(aLong);
    }
}
