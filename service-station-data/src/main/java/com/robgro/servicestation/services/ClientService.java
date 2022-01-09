package com.robgro.servicestation.services;

import com.robgro.servicestation.model.Client;

public interface ClientService extends CrudService<Client, Long> {

    Client findByLastName(String lastName);

}
