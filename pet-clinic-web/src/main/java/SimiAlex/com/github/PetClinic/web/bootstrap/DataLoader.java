package SimiAlex.com.github.PetClinic.web.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import SimiAlex.com.github.PetClinic.model.Owner;
import SimiAlex.com.github.PetClinic.model.PetType;
import SimiAlex.com.github.PetClinic.model.Vet;
import SimiAlex.com.github.PetClinic.services.OwnerService;
import SimiAlex.com.github.PetClinic.services.PetTypeService;
import SimiAlex.com.github.PetClinic.services.VetService;


@Component
public class DataLoader implements CommandLineRunner{

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;

    }
    
    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Alex");
        owner1.setLastName("Simi");
        owner1.setAddress("4 gura Vadului");
        owner1.setCity("Bucharest");
        owner1.setTelephone("86876y78676");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ionut");
        owner2.setLastName("Vasile");
        owner1.setAddress("3 vlahita");
        owner1.setCity("Bucharest");
        owner1.setTelephone("86876y78676");
        ownerService.save(owner2);

        System.out.println("Owners where loaded...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Marcel");
        vet1.setLastName("Ionescu");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ciprian");
        vet2.setLastName("Marinescu");

        vetService.save(vet2);

        System.out.println("Vets where loaded...");
    }

    
    
}
