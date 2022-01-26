package com.robgro.servicestation.model;

import java.util.Set;

public class Mechanic extends Person{

    private Set<Specialization> specializations;

    public Set<Specialization> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(Set<Specialization> specializations) {
        this.specializations = specializations;
    }
}
