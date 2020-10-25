package SimiAlex.com.github.PetClinic.services.springDataJPA;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import SimiAlex.com.github.PetClinic.model.Visit;
import SimiAlex.com.github.PetClinic.repositories.VisitRepository;
import SimiAlex.com.github.PetClinic.services.VisitService;

@Service
@Profile("springDataJPA")
public class VisitServiceJPA implements VisitService 

{

    private VisitRepository visitRepository;

    public VisitServiceJPA(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
          HashSet<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visit -> visits.add(visit));
        return visits;
    }

    @Override
    public Visit findById(Long id) {
        Optional<Visit> visitOPT = visitRepository.findById(id);
        return visitOPT.orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
        }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
