package com.robgro.servicestation.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "car_models")
public class CarModel extends BaseEntity {

    @Column(name = "model")
    private String carModel;    // Volkswagen Passat

    @Column(name = "color")
    private String color;       // black

    @Column(name = "car_plate")
    private String carPlate;    // GH19GGE
}
