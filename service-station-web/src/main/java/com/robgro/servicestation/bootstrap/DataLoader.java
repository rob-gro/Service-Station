package com.robgro.servicestation.bootstrap;

import com.robgro.servicestation.model.Mechanic;
import com.robgro.servicestation.model.Owner;
import com.robgro.servicestation.services.MechanicService;
import com.robgro.servicestation.services.OwnerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final MechanicService mechanicService;

    public DataLoader(OwnerService ownerService, MechanicService mechanicService) {
        this.ownerService = ownerService;
        this.mechanicService = mechanicService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Agnieszka");
        owner1.setLastName("Markiewicz");
        owner1.setPhoneNumber("074789654123");
        owner1.setEmail("aga.markiewicz.szkocja@gmail.com");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Robert");
        owner2.setLastName("Grodzki");
        owner2.setPhoneNumber("07478385228");
        owner2.setEmail("r.grodzki74@gmail.com");

        ownerService.save(owner2);
        System.out.println("Loaded owners ...");

        Mechanic mechanic1 = new Mechanic();
        mechanic1.setId(11L);
        mechanic1.setFirstName("Arnold");
        mechanic1.setLastName("Schwarzenegger");
        mechanic1.setPhoneNumber("987456321");
        mechanic1.setEmail("a.schwarzenegger@paramount.com");

        mechanicService.save(mechanic1);

        Mechanic mechanic2 = new Mechanic();
        mechanic2.setId(22L);
        mechanic2.setFirstName("Robert");
        mechanic2.setLastName("Kubica");
        mechanic2.setPhoneNumber("32145698888");
        mechanic2.setEmail("kubica@F1.com");

        mechanicService.save(mechanic2);
        System.out.println("Loaded mechanics .....");
    }
}
