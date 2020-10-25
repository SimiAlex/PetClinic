package SimiAlex.com.github.PetClinic.services;

import java.util.List;
import java.util.Set;

import SimiAlex.com.github.PetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> 
{
    public abstract List<Owner> findByLastName(String lastName);   
}
