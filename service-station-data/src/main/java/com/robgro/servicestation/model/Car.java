package com.robgro.servicestation.model;

public class Car extends BaseEntity{

    private Owner owner;
    private CarType carType;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
