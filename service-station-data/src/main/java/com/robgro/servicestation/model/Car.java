package com.robgro.servicestation.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
}
