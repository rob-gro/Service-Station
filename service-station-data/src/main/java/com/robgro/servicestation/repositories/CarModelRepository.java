package com.robgro.servicestation.repositories;

import com.robgro.servicestation.model.CarModel;
import org.springframework.data.repository.CrudRepository;

public interface CarModelRepository extends CrudRepository<CarModel, Long> {
}
