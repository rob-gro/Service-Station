package com.robgro.servicestation.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "clients") 
public class Client extends Person {

    @Builder
    public Client(String firstName, String lastName, String phoneNumber, String email, Set<Car> cars) {
        super(firstName, lastName, phoneNumber, email);
        this.cars = cars;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private Set<Car> cars = new HashSet<>();
}
