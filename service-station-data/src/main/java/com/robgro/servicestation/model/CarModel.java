package com.robgro.servicestation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car_models")
public class CarModel extends BaseEntity {

    @Column(name = "car_model")
    private String carModel;    // Volkswagen Passat

    @Column(name = "color")
    private String color;       // black

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
