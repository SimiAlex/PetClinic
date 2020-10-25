package SimiAlex.com.github.PetClinic.repositories;

import org.springframework.data.repository.CrudRepository;

import SimiAlex.com.github.PetClinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long>
{
    
}
