package com.robgro.servicestation.services.springdatajpa;

import com.robgro.servicestation.model.Specialization;
import com.robgro.servicestation.repositories.SpecializationRepository;
import com.robgro.servicestation.services.SpecializationService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecializationSDJpaService implements SpecializationService {

    private final SpecializationRepository specializationRepository;

    public SpecializationSDJpaService(SpecializationRepository specializationRepository) {
        this.specializationRepository = specializationRepository;
    }

    @Override
    public Set<Specialization> findAll() {
        Set<Specialization> specializations = new HashSet<>();
        specializationRepository.findAll().forEach(specializations::add);
        return specializations;
    }

    @Override
    public Specialization findById(Long aLong) {
        return specializationRepository.findById(aLong).orElse(null);
    }

    @Override
    public Specialization save(Specialization object) {
        return specializationRepository.save(object);
    }

    @Override
    public void delete(Specialization object) {
        specializationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specializationRepository.deleteById(aLong);
    }
}
