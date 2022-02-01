package com.robgro.servicestation.services.springdatajpa;

import com.robgro.servicestation.model.Client;
import com.robgro.servicestation.repositories.CarModelRepository;
import com.robgro.servicestation.repositories.CarRepository;
import com.robgro.servicestation.repositories.ClientRepository;
import com.robgro.servicestation.services.ClientService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Primary
@Profile("springdatajpa")
public class ClientSDJpaService implements ClientService {

    private final ClientRepository clientRepository;
    private final CarRepository carRepository;
    private final CarModelRepository carModelRepository;

    public ClientSDJpaService(ClientRepository clientRepository, CarRepository carRepository,
                              CarModelRepository carModelRepository) {
        this.clientRepository = clientRepository;
        this.carRepository = carRepository;
        this.carModelRepository = carModelRepository;
    }

    @Override
    public ClientRepository findByLastName(String lastName) {
        return (ClientRepository) clientRepository.findByLastName(lastName);
    }

    @Override
    public Set<Client> findAll() {
        Set<Client> clients = new HashSet<>();
        clientRepository.findAll().forEach(clients::add);
        return clients;
    }

    @Override
    public Client findById(Long aLong) {
        return clientRepository.findById(aLong).orElse(null);
    }

    @Override
    public Client save(Client object) {
        return clientRepository.save(object);
    }

    @Override
    public void delete(Client object) {
        clientRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        clientRepository.deleteById(aLong);
    }
}
