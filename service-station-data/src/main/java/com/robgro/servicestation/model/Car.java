package com.robgro.servicestation.model;

import lombok.Data;

@Data
public class Car {

    private Owner owner;
    private CarType carType;
    private String carPlate;
}
