package SimiAlex.com.github.PetClinic.services;

import java.util.Set;

import SimiAlex.com.github.PetClinic.model.Pet;

public interface PetService {
   
    public abstract Pet findById(Long Id);
    public abstract Pet save(Pet pet);
    public abstract Set<Pet> findAll();
}
