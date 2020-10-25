package SimiAlex.com.github.PetClinic.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import SimiAlex.com.github.PetClinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>
{
    public abstract List<Owner> findByLastName(String lastName);
}
