package SimiAlex.com.github.PetClinic.services;

import java.util.Set;

import SimiAlex.com.github.PetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> 
{
    public abstract Owner findByLastName (String lastName);   
}
