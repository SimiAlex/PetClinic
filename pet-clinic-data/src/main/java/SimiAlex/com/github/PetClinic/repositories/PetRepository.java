package SimiAlex.com.github.PetClinic.repositories;

import org.springframework.data.repository.CrudRepository;

import SimiAlex.com.github.PetClinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>
{
    
}
