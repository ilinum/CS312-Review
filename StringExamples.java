/**
 * Created by Svyatoslav Ilinskiy on 11/2/14.
 *
 * Class that contains following examples concerning Strings:
 *
 * 1. String equality
 * 2. Strings as parameters
 * 3. String methods (charAt(), indexOf(), contains(), substring())
 */
public class StringExamples {

    public static void main(String[] args) {
//        stringEquality();
//        stringAsParameters();
    }

    /**
     * method that provides examples about String equality
     */
    public static void stringEquality() {
        String a = "abc";
        String b = "abcd";
        String c = b.substring(0, 3);
        //are they equal?
        testEquality(a, c);
        a = c;
        //are they equal now?
        testEquality(a, c);
    }

    /**
     * Method that test if two Strings are equal in different ways
     * @param a first String
     * @param b second String
     */
    public static void testEquality(String a, String b) {
        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + (a.equals(b)));
    }

    /**
     * Method that provides some example for Strings used as parameters
     */
    public static void stringAsParameters() {
        String a = "abc";
        manipulateString(a);
        System.out.println(a);
    }

    /**
     * a helper method for stringAsParameters().
     * @param a String passed in
     */
    public static void manipulateString(String a) {
        a += "d";
        System.out.println(a);
        a = "ef";
        System.out.println(a);
    }
}

