package SimiAlex.com.github.PetClinic.services.springDataJPA;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import SimiAlex.com.github.PetClinic.model.Pet;
import SimiAlex.com.github.PetClinic.repositories.PetRepository;
import SimiAlex.com.github.PetClinic.services.PetService;

@Service
@Profile({"default","springDataJPA"})
public class PetServiceJPA implements PetService {

    private PetRepository petRepository;
    
    public PetServiceJPA(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        HashSet<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pet -> pets.add(pet));
        return pets;
    }

    @Override
    public Pet findById(Long id) {
        Optional<Pet> petOPT = petRepository.findById(id);
        return petOPT.orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }  
}
