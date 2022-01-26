package com.robgro.servicestation.model;

public class Car extends BaseEntity{

    private Client client;
    private CarType carType;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
