package com.robgro.servicestation.services.springdatajpa;

import com.robgro.servicestation.model.Appointment;
import com.robgro.servicestation.repositories.AppointmentRepository;
import com.robgro.servicestation.services.AppointmentService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Primary
@Profile("springdatajpa")
public class AppointmentSDJpaService implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentSDJpaService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Set<Appointment> findAll() {
        Set<Appointment> appointments = new HashSet<>();
        appointmentRepository.findAll().forEach(appointments::add);
        return appointments;
    }

    @Override
    public Appointment findById(Long aLong) {
        return appointmentRepository.findById(aLong).orElse(null);
    }

    @Override
    public Appointment save(Appointment object) {
        return appointmentRepository.save(object);
    }

    @Override
    public void delete(Appointment object) {
        appointmentRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        appointmentRepository.deleteById(aLong);
    }
}
