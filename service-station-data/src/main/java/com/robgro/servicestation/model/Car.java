package com.robgro.servicestation.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cars")
public class Car extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private CarModel model;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "car")
    private Set<Appointment> appointments = new HashSet<>();

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }
}
