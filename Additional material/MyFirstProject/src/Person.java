
public class Person {
    // Attributes - make ssn private for proper encapsulation
    private String firstName = "John";
    private String lastName = "Smith";
    private String ssn = "0";

    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public Person() {
        this.firstName = "John";
        this.lastName = "Smith";
        this.ssn = "0";
    }

    public void print() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("SSN: " + ssn);
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

}
