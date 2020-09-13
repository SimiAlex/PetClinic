package SimiAlex.com.github.PetClinic.services;

import java.util.Set;

import SimiAlex.com.github.PetClinic.model.Vet;

public interface VetService {
    
    public abstract Vet findById(Long Id);
    public abstract Vet save(Vet vet);
    public abstract Set<Vet> findAll();
    
}
