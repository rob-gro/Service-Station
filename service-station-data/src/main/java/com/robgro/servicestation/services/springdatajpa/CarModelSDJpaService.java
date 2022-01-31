package com.robgro.servicestation.services.springdatajpa;

import com.robgro.servicestation.model.CarModel;
import com.robgro.servicestation.repositories.CarModelRepository;
import com.robgro.servicestation.services.CarModelService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class CarModelSDJpaService implements CarModelService {

    private final CarModelRepository carModelRepository;

    public CarModelSDJpaService(CarModelRepository carModelRepository) {
        this.carModelRepository = carModelRepository;
    }

    @Override
    public Set<CarModel> findAll() {
        Set<CarModel> carModels = new HashSet<>();
        carModelRepository.findAll().forEach(carModels::add);
        return carModels;
    }

    @Override
    public CarModel findById(Long aLong) {
        return carModelRepository.findById(aLong).orElse(null);
    }

    @Override
    public CarModel save(CarModel object) {
        return carModelRepository.save(object);
    }

    @Override
    public void delete(CarModel object) {
        carModelRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        carModelRepository.deleteById(aLong);
    }
}
