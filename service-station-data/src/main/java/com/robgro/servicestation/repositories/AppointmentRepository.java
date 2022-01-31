package com.robgro.servicestation.repositories;

import com.robgro.servicestation.model.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
}
