package com.robgro.servicestation.services;

import com.robgro.servicestation.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
