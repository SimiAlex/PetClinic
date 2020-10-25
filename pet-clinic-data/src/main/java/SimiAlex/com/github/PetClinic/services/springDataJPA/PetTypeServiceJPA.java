package SimiAlex.com.github.PetClinic.services.springDataJPA;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import SimiAlex.com.github.PetClinic.model.PetType;
import SimiAlex.com.github.PetClinic.repositories.PetTypeRepository;
import SimiAlex.com.github.PetClinic.services.PetTypeService;

@Service
@Profile("springDataJPA")
public class PetTypeServiceJPA implements PetTypeService {

    private PetTypeRepository petTypeRepository;
    
    public PetTypeServiceJPA(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }
    
    @Override
    public Set<PetType> findAll() {
        HashSet<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petType -> petTypes.add(petType));
        return petTypes;
    }

    @Override
    public PetType findById(Long id) 
    {
        Optional<PetType> petTypeOPT = petTypeRepository.findById(id);

        return petTypeOPT.orElse(null);

    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);

    }

  
    
}
