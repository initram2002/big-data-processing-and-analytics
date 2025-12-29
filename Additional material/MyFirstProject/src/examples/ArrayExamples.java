package examples;

public class ArrayExamples {

    // #define NUM_ELEMENTS 10
    static final int NUM_ELEMENTS = 10;

    public static void main(String[] args) {

        int [] iv = new int[NUM_ELEMENTS];
        int j[];

        iv = new int[] {1, 2, 3, 4, 5};

        // System.out.println("j[0] = " + j[0]);

        for (int i = 0; i < iv.length; ++i) {
            int element = iv[i];
            System.out.println(element);
        }
        // OR (better)
        for (int element : iv) { // for-each
            System.out.println(element);
        }



        String[] sv = new String[10];

        for (int i = 0; i < sv.length; ++i) {
            sv[i] = "";
        }


        System.out.println(sv[0].toUpperCase() + ".");

    }

    class String_ARRAY {
        public String element0 = null;
        public String element1 = null;
        // ...
        public String element9 = null;

    }

}
