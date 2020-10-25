package SimiAlex.com.github.PetClinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends BaseEntity
{
    // fields
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    // methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
}
