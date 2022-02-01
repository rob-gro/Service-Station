package com.robgro.servicestation.bootstrap;

import com.robgro.servicestation.model.*;
import com.robgro.servicestation.services.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

    private final ClientService clientService;
    private final MechanicService mechanicService;
    private final CarModelService carModelService;
    private final SpecializationService specializationService;
    private final AppointmentService appointmentService;

    public DataLoader(ClientService clientService, MechanicService mechanicService, CarModelService carModelService,
                      SpecializationService specializationService, AppointmentService appointmentService) {
        this.clientService = clientService;
        this.mechanicService = mechanicService;
        this.carModelService = carModelService;
        this.specializationService = specializationService;
        this.appointmentService = appointmentService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = carModelService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {

        // add cars and models
        CarModel volkswagen = new CarModel();
        volkswagen.setCarModel("Volkswagen");
        CarModel savedVolModel = carModelService.save(volkswagen);

        CarModel vauxhall = new CarModel();
        vauxhall.setCarModel("Vauxhall");
        CarModel saveVauModel = carModelService.save(vauxhall);

        // make client 1
        Client client1 = new Client();
        client1.setFirstName("Agnieszka");
        client1.setLastName("Markiewicz");
        client1.setPhoneNumber("07922322002");
        client1.setEmail("aga.markiewicz.szkocja@gmail.com");

        // add client 1 car
        Car agasCar = new Car();
        agasCar.setModel(savedVolModel);
        agasCar.setClient(client1);
        client1.getCars().add(agasCar);

        clientService.save(client1);

        // make client 2
        Client client2 = new Client();
        client2.setFirstName("Robert");
        client2.setLastName("Grodzki");
        client2.setPhoneNumber("07478385228");
        client2.setEmail("r.grodzki74@gmail.com");

        // add 2nd car
        Car robCar = new Car();
        robCar.setModel(saveVauModel);
        robCar.setClient(client2);
        client2.getCars().add(robCar);

        clientService.save(client2);

        // add appointments for cars objects
        Appointment vauAppointment = new Appointment();
        vauAppointment.setCar(robCar);
        vauAppointment.setDate(LocalDate.now());
        vauAppointment.setDescription("Check engine issue");
        appointmentService.save(vauAppointment);

        Appointment volAppointment = new Appointment();
        volAppointment.setCar(agasCar);
        volAppointment.setDate(LocalDate.now());
        volAppointment.setDescription("Change winter tyres");
        appointmentService.save(volAppointment);

        // confirmation
        System.out.println("Loaded clients ...");

        // add mechanical's specialization
        Specialization mechanic = new Specialization();
        mechanic.setDescription("Mechanic");
        Specialization savedMechanic = specializationService.save(mechanic);

        Specialization sprayer = new Specialization();
        sprayer.setDescription("Sprayer");
        Specialization savedSprayer = specializationService.save(sprayer);

        Specialization electrician = new Specialization();
        electrician.setDescription("Electrician");
        Specialization savedElectrician = specializationService.save(electrician);

        Specialization tinsmith = new Specialization();
        tinsmith.setDescription("Tinsmith");
        Specialization savedTinsmith = specializationService.save(tinsmith);

        // add mechanic 1
        Mechanic mechanic1 = new Mechanic();
        mechanic1.setFirstName("Arnold");
        mechanic1.setLastName("Schwarzenegger");
        mechanic1.getSpecializations().add(savedElectrician);
        mechanic1.setPhoneNumber("987456321");
        mechanic1.setEmail("a.schwarzenegger@paramount.com");

        mechanicService.save(mechanic1);

        // add mechanic 2
        Mechanic mechanic2 = new Mechanic();
        mechanic2.setFirstName("Robert");
        mechanic2.setLastName("Kubica");
        mechanic2.getSpecializations().add(savedSprayer);
        mechanic2.setPhoneNumber("32145698888");
        mechanic2.setEmail("kubica@F1.com");

        mechanicService.save(mechanic2);

        // confirmation
        System.out.println("Loaded mechanics .....");
    }
}
