package com.robgro.servicestation.model;

import java.util.Set;

public class Client extends Person {

    private Set<Car> cars;

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}
