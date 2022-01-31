package com.robgro.servicestation.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "mechanics")
public class Mechanic extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "mech_specialize", joinColumns = @JoinColumn(name = "mechanic_id"), inverseJoinColumns = @JoinColumn(name = "specialization_id"))
    private Set<Specialization> specializations = new HashSet<>();

    public Set<Specialization> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(Set<Specialization> specializations) {
        this.specializations = specializations;
    }
}
