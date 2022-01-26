package com.robgro.servicestation.services.map;

import com.robgro.servicestation.model.CarModel;
import com.robgro.servicestation.services.CarModelService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CarModelMapService extends AbstractMapService<CarModel, Long> implements CarModelService {
    @Override
    public Set<CarModel> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(CarModel object) {
        super.delete(object);
    }

    @Override
    public CarModel save(CarModel object) {
        return super.save(object);
    }

    @Override
    public CarModel findById(Long id) {
        return super.findById(id);
    }
}
