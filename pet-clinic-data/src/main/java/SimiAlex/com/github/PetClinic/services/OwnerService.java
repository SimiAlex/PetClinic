package SimiAlex.com.github.PetClinic.services;

import java.util.Set;

import SimiAlex.com.github.PetClinic.model.Owner;

public interface OwnerService {
    public abstract Owner findByLastName (String lastName);
    public abstract Owner findById(Long Id);
    public abstract Owner save(Owner owner);
    public abstract Set<Owner> findAll();
    
}
