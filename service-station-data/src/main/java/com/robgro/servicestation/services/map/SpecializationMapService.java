package com.robgro.servicestation.services.map;

import com.robgro.servicestation.model.Specialization;
import com.robgro.servicestation.services.SpecializationService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecializationMapService extends AbstractMapService<Specialization, Long> implements SpecializationService {
    @Override
    public Set<Specialization> findAll() {
        return super.findAll();
    }

    @Override
    public Specialization findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialization save(Specialization object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialization object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
