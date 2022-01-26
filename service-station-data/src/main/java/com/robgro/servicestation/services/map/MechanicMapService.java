package com.robgro.servicestation.services.map;

import com.robgro.servicestation.model.Mechanic;
import com.robgro.servicestation.services.MechanicService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MechanicMapService extends AbstractMapService<Mechanic, Long> implements MechanicService {

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
