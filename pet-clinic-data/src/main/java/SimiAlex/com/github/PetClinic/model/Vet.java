package SimiAlex.com.github.PetClinic.model;

import java.util.Set;

public class Vet extends Person 
{
    // fields    
    private Set<Speciality> specialities;

    // methods
    public Set<Speciality> getSpecialities() 
    {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) 
    {
        this.specialities = specialities;
    }
}
