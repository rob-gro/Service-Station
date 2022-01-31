package com.robgro.servicestation.services.springdatajpa;

import com.robgro.servicestation.model.Mechanic;
import com.robgro.servicestation.repositories.MechanicRepository;
import com.robgro.servicestation.services.MechanicService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class MechanicSDJpaService implements MechanicService {

    private final MechanicRepository mechanicRepository;

    public MechanicSDJpaService(MechanicRepository mechanicRepository) {
        this.mechanicRepository = mechanicRepository;
    }

    @Override
    public Set<Mechanic> findAll() {
        Set<Mechanic> mechanics = new HashSet<>();
        mechanicRepository.findAll().forEach(mechanics::add);
        return mechanics;
    }

    @Override
    public Mechanic findById(Long aLong) {
        return mechanicRepository.findById(aLong).orElse(null);
    }

    @Override
    public Mechanic save(Mechanic object) {
        return mechanicRepository.save(object);
    }

    @Override
    public void delete(Mechanic object) {
        mechanicRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        mechanicRepository.deleteById(aLong);
    }
}
