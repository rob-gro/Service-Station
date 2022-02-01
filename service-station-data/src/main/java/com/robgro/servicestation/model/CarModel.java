package com.robgro.servicestation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car_models")
public class CarModel extends BaseEntity {

    @Column(name = "model")
    private String carModel;    // Volkswagen Passat

    @Column(name = "color")
    private String color;       // black

    @Column(name = "car_plate")
    private String carPlate;    // GH19GGE

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

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }
}
