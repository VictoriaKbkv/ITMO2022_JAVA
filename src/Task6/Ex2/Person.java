package Task6.Ex2;

public abstract class Person {

    private String FirstName;
    private String LastName;

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Person(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
}
