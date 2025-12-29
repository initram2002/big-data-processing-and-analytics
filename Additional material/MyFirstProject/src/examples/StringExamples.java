package examples;

import javax.swing.JOptionPane;

/**
 * This class contains examples
 *
 * @author initram2002
 *
 */
public class StringExamples {

    public static void main(String[] args) {


        // java.lang.String
        String s = "Hello!";
        // char* s = "Hello!";

        s = new String("Hello!");

        System.out.println(s);
        String s2 = s.toUpperCase();
        System.out.println(s);
        System.out.println(s2);

        String tmp = new String("Hello!");
        if (s == tmp) {
        // if (s == "Hello!") {
            System.out.println("Yes");
        } else {
            System.out.println("No: distinct objects");
        }

        if (s.equals(tmp)) {
            System.out.println("Same content");
        }


        int i = Integer.parseInt("2");

        String input = JOptionPane.showInputDialog("Enter a number");

        i = Integer.parseInt(input) * 2;

        // System.out.println("Doubled = " + i);

        JOptionPane.showMessageDialog(null, "Doubled = " + i);

    }

}
