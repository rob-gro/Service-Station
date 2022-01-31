package com.robgro.servicestation.services.map;

import com.robgro.servicestation.model.Mechanic;
import com.robgro.servicestation.model.Specialization;
import com.robgro.servicestation.services.MechanicService;
import com.robgro.servicestation.services.SpecializationService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MechanicMapService extends AbstractMapService<Mechanic, Long> implements MechanicService {

    private final SpecializationService specializationService;

    public MechanicMapService(SpecializationService specializationService) {
        this.specializationService = specializationService;
    }

    @Override
    public Set<Mechanic> findAll() {
        return super.findAll();
    }

    @Override
    public Mechanic findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Mechanic save(Mechanic object) {
        if (object.getSpecializations().size() > 0) {
            object.getSpecializations().forEach(specialization -> {
                if (specialization.getId() == null) {
                    Specialization savedSpecialization = specializationService.save(specialization);
                    specialization.setId(savedSpecialization.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Mechanic object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
