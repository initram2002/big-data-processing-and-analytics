
public class MyApp {

    public static void main(String[] args) {

        Person p; // this is just a reference

        p = new Person("John", "Smith", "0"); // now an object is created

        p . print();

        // p.firstName = "NOTHING"; // NOT VISIBLE!!!

        Person q = new Person("Mario", "Rossi", "1");

        q.print();


        Person r = new Person();


    }

}
