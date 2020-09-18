package SimiAlex.com.github.PetClinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import SimiAlex.com.github.PetClinic.model.Vet;
import SimiAlex.com.github.PetClinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService 
{
    // methods - from interface
    @Override
    public Set<Vet> findAll() 
    {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) 
    {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) 
    {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) 
    {    
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) 
    {
        super.deleteById(id);
    }
}

