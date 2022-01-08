package com.robgro.servicestation.services.map;

import com.robgro.servicestation.model.Car;
import com.robgro.servicestation.services.CarService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CarServiceMap extends AbstractMapService<Car, Long> implements CarService {
    @Override
    public Set<Car> findAll() {
        return super.findAll();
    }

    @Override
    public Car findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Car save(Car object) {
        return super.save(object);
    }

    @Override
    public void delete(Car object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
