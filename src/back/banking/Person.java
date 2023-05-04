package back.banking;

/**
 * The concrete Account holder of Person type.
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        //todo idNumber
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
}
