package SimiAlex.com.github.PetClinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import SimiAlex.com.github.PetClinic.model.Pet;
import SimiAlex.com.github.PetClinic.services.PetService;

@Service
public class PetServiceMap extends  AbstractMapService<Pet> implements PetService {

    @Override
    public Set<Pet> findAll() {
        
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
            super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

  
}
