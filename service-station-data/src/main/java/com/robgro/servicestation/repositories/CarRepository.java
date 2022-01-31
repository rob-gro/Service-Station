package com.robgro.servicestation.repositories;

import com.robgro.servicestation.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
