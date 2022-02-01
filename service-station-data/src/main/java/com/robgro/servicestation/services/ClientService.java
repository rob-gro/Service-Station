package com.robgro.servicestation.services;

import com.robgro.servicestation.model.Client;
import com.robgro.servicestation.repositories.ClientRepository;

public interface ClientService extends CrudService<Client, Long> {

    ClientRepository findByLastName(String lastName);
}
