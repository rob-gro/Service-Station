package com.robgro.servicestation.model;

public class Car extends BaseEntity {

    private Client client;
    private CarModel carModel;
    private CarModel carPlate;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public CarModel getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(CarModel carPlate) {
        this.carPlate = carPlate;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }
}
