package com.robgro.servicestation.repositories;

import com.robgro.servicestation.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {

    Client findByLastName(String lastName);
}
