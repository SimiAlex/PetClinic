package SimiAlex.com.github.PetClinic.services.springDataJPA;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import SimiAlex.com.github.PetClinic.model.Owner;
import SimiAlex.com.github.PetClinic.repositories.OwnerRepository;
import SimiAlex.com.github.PetClinic.repositories.PetRepository;
import SimiAlex.com.github.PetClinic.repositories.PetTypeRepository;
import SimiAlex.com.github.PetClinic.services.OwnerService;

@Service
@Profile({"default","springDataJPA"})
public class OwnerServiceJPA implements OwnerService 
{
    //fields
    private OwnerRepository ownerRepository;
    private PetRepository petRepository;
    private PetTypeRepository petTypeRepository;

    //constructor
    @Autowired
    public OwnerServiceJPA(OwnerRepository ownerRepository, PetRepository petDAO, PetTypeRepository petTypeDAO) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petDAO;
        this.petTypeRepository = petTypeDAO;
    }

    @Override
    public Set<Owner> findAll() {
        
        HashSet<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owner -> owners.add(owner));

        return owners;
    }

    @Override
    public Owner findById(Long id) {
        Optional<Owner> ownerOPT = ownerRepository.findById(id);

        return ownerOPT.orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public List<Owner> findByLastName(String lastName) 
    {
        return ownerRepository.findByLastName(lastName);
    }

    
}
