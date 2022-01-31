package com.robgro.servicestation.services.map;

import com.robgro.servicestation.model.Car;
import com.robgro.servicestation.model.Client;
import com.robgro.servicestation.services.CarModelService;
import com.robgro.servicestation.services.CarService;
import com.robgro.servicestation.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ClientMapService extends AbstractMapService<Client, Long> implements ClientService {

    private final CarModelService carModelService;
    private final CarService carService;

    public ClientMapService(CarModelService carModelService, CarService carService) {
        this.carModelService = carModelService;
        this.carService = carService;
    }

    @Override
    public Set<Client> findAll() {
        return super.findAll();
    }

    @Override
    public Client findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Client save(Client object) {
        if (object != null) {
            if (object.getCars() != null) {
                object.getCars().forEach(car -> {
                    if (car.getModel() != null) {
                        if (car.getModel().getId() == null) {
                            car.setModel(carModelService.save(car.getModel()));
                        }
                    } else {
                        throw new RuntimeException("Car Model is required");
                    }
                    if (car.getId() == null) {
                        Car savedCar = carService.save(car);
                        car.setId(savedCar.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public void delete(Client object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Client findByLastName(String lastName) {
        return null;
    }
}
