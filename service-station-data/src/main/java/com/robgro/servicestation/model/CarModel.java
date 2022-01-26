package com.robgro.servicestation.model;

public class CarModel extends BaseEntity {

    private String carModel;    // Volkswagen
    private String carType;     // Passat --> I think it's a wrong idea --> Station Wagon, Sedan, Hatchback, Coupe, Convertible, Sport, SUV, MiniVan, Pickup
    private String color;       // black
    private String carPlate;    // GH19GGE

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

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
