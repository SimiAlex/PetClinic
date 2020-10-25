import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import SimiAlex.com.github.PetClinic.model.Vet;
import SimiAlex.com.github.PetClinic.repositories.VetRepository;
import SimiAlex.com.github.PetClinic.services.VetService;

@Service
@Profile("springDataJPA")
public class VetServiceJPA implements VetService 
{
    private VetRepository vetRepository;
    
    public VetServiceJPA(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() 
    {
        HashSet<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vet -> vets.add(vet));
        return vets;
    }

    @Override
    public Vet findById(Long id) {
        Optional<Vet> vetOPT = vetRepository.findById(id);
        return vetOPT.orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }

 
    
}