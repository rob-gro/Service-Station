package com.robgro.servicestation.bootstrap;

import com.robgro.servicestation.model.Client;
import com.robgro.servicestation.model.Mechanic;
import com.robgro.servicestation.services.ClientService;
import com.robgro.servicestation.services.MechanicService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ClientService clientService;
    private final MechanicService mechanicService;

    public DataLoader(ClientService clientService, MechanicService mechanicService) {
        this.clientService = clientService;
        this.mechanicService = mechanicService;
    }

    @Override
    public void run(String... args) throws Exception {

        Client client1 = new Client();
        client1.setFirstName("Agnieszka");
        client1.setLastName("Markiewicz");
        client1.setPhoneNumber("074789654123");
        client1.setEmail("aga.markiewicz.szkocja@gmail.com");

        clientService.save(client1);

        Client client2 = new Client();
        client2.setFirstName("Robert");
        client2.setLastName("Grodzki");
        client2.setPhoneNumber("07478385228");
        client2.setEmail("r.grodzki74@gmail.com");

        clientService.save(client2);
        System.out.println("Loaded owners ...");

        Mechanic mechanic1 = new Mechanic();
        mechanic1.setFirstName("Arnold");
        mechanic1.setLastName("Schwarzenegger");
        mechanic1.setPhoneNumber("987456321");
        mechanic1.setEmail("a.schwarzenegger@paramount.com");

        mechanicService.save(mechanic1);

        Mechanic mechanic2 = new Mechanic();
        mechanic2.setFirstName("Robert");
        mechanic2.setLastName("Kubica");
        mechanic2.setPhoneNumber("32145698888");
        mechanic2.setEmail("kubica@F1.com");

        mechanicService.save(mechanic2);
        System.out.println("Loaded mechanics .....");
    }
}
