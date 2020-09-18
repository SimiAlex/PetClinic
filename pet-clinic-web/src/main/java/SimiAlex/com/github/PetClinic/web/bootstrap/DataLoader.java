package SimiAlex.com.github.PetClinic.web.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import SimiAlex.com.github.PetClinic.model.Owner;
import SimiAlex.com.github.PetClinic.model.Vet;
import SimiAlex.com.github.PetClinic.services.OwnerService;
import SimiAlex.com.github.PetClinic.services.VetService;


@Component
public class DataLoader implements CommandLineRunner{

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService){

        this.ownerService = ownerService;
        this.vetService = vetService;

    }
    
    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Alex");
        owner1.setLastName("Simi");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Gigi");
        owner2.setLastName("Calu");

        ownerService.save(owner2);

        System.out.println("Owners where loaded...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Oaca");
        vet1.setLastName("Arizona");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Ozone");
        vet2.setLastName("Mamamia");

        vetService.save(vet2);

        System.out.println("Vets where loaded...");
    }

    
    
}
