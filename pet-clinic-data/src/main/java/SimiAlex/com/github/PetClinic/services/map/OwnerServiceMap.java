package SimiAlex.com.github.PetClinic.services.map;

import java.util.Collection;
import java.util.Set;

import org.springframework.stereotype.Service;

import SimiAlex.com.github.PetClinic.model.Owner;
import SimiAlex.com.github.PetClinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService 
{
    // methods
    @Override
    public Set<Owner> findAll() {
        
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner object) {
            super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        Collection<Owner> collection = map.values();
        
        for (Owner o : collection)
        {
            if (lastName.equals(o.getLastName()))
            {
                return o;
            }
        }

        return null;
    }
}
