package SimiAlex.com.github.PetClinic.model;

public class Person extends BaseEntity
{
    // fields
    private String firstName;
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
