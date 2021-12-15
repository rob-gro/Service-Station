package com.robgro.servicestation;

import com.robgro.servicestation.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceStationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceStationApplication.class, args);
        Person person = new Person();
        person.setFirstName("rob");
    }

}
