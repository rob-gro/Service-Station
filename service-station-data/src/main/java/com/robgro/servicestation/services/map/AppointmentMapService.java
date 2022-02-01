package com.robgro.servicestation.services.map;

import com.robgro.servicestation.model.Appointment;
import com.robgro.servicestation.services.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AppointmentMapService extends AbstractMapService<Appointment, Long> implements AppointmentService {

    @Override
    public Set<Appointment> findAll() {
        return super.findAll();
    }

    @Override
    public Appointment findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Appointment save(Appointment appointment) {
        if (appointment.getCar() == null || appointment.getCar() == null || appointment.getCar().getId() == null) {
            throw new RuntimeException("Invalid appointment");
        }
        return super.save(appointment);
    }

    @Override
    public void delete(Appointment object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
