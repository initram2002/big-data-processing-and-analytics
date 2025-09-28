
public class MyApp {

    public static void main(String[] args) {

        Person p; // this is just a reference

        p = new Person("John", "Smith", "0"); // now an object is created

        p . print();

        // p.firstName = "NOTHING"; // NOT VISIBLE - private field

        Person q = new Person("Mario", "Rossi", "1");

        q.print();

        // q.ssn = "12345"; // NOT VISIBLE - now private for proper encapsulation

        // Use setter instead

        q.setSsn("12345");

        System.out.println("Updated SSN: " + q.getSsn());

        Person r = new Person(); // uses default constructor

        r.print();

        // Demonstrate getters and setters
        r.setFirstName("Alice");
        r.setLastName("Johnson");
        System.out.println("\nAfter modification:");
        r.print();

    }

}
