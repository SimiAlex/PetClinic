package SimiAlex.com.github.PetClinic.services.springDataJPA;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import SimiAlex.com.github.PetClinic.model.Speciality;
import SimiAlex.com.github.PetClinic.repositories.SpecialityRepository;
import SimiAlex.com.github.PetClinic.services.SpecialityService;

@Service
@Profile("springDataJPA")
public class SpecialityServiceJPA implements SpecialityService {

    private SpecialityRepository specialityRep;

    public SpecialityServiceJPA(SpecialityRepository specialityRep) {
        this.specialityRep = specialityRep;
    }
    
    @Override
    public Set<Speciality> findAll() {
        HashSet<Speciality> specialities = new HashSet<>();
        specialityRep.findAll().forEach(speciality -> specialities.add(speciality));
        return specialities;
    }

    @Override
    public Speciality findById(Long id) {
        Optional<Speciality> specialityOPT = specialityRep.findById(id);
        return specialityOPT.orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRep.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRep.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        specialityRep.deleteById(id);

    }

}
