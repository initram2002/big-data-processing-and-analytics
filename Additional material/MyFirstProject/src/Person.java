
public class Person {
    // Attributes
    private String firstName = "John";
    private String lastName = "Smith";
    private String ssn = "0";

    public Person(String f, String l, String s) {
        firstName = f;
        lastName = l;
        ssn = s;
    }

    public Person() {
        // ...
        ssn = "0";
    }

    public void print() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(ssn);
    }

}
