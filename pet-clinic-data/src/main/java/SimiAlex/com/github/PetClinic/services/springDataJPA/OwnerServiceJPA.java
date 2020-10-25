package SimiAlex.com.github.PetClinic.services.springDataJPA;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import SimiAlex.com.github.PetClinic.model.Owner;
import SimiAlex.com.github.PetClinic.repositories.OwnerRepository;
import SimiAlex.com.github.PetClinic.repositories.PetRepository;
import SimiAlex.com.github.PetClinic.repositories.PetTypeRepository;
import SimiAlex.com.github.PetClinic.services.OwnerService;

@Service
@Profile("springDataJPA")
public class OwnerServiceJPA implements OwnerService 
{
    //fields
    private OwnerRepository ownerDAO;
    private PetRepository petDAO;
    private PetTypeRepository petTypeDAO;

    //constructor
    public OwnerServiceJPA(OwnerRepository ownerDAO, PetRepository petDAO, PetTypeRepository petTypeDAO) {
        this.ownerDAO = ownerDAO;
        this.petDAO = petDAO;
        this.petTypeDAO = petTypeDAO;
    }

    @Override
    public Set<Owner> findAll() {
        
        HashSet<Owner> owners = new HashSet<>();
        ownerDAO.findAll().forEach(owner -> owners.add(owner));

        return owners;
    }

    @Override
    public Owner findById(Long id) {
        Optional<Owner> ownerOPT = ownerDAO.findById(id);

        return ownerOPT.orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        
        return ownerDAO.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerDAO.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        ownerDAO.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerDAO.findByLastName(lastName);
    }

    
}
