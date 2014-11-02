/**
 * Created by Svyatoslav Ilinskiy on 11/2/14.
 *
 * Class that contains following examples concerning Strings:
 *
 * 1. String equality
 * 2.
 */
public class StringExamples {

    public static void main(String[] args) {
        stringEquality();
    }

    public static void stringEquality() {
        String a = "a" + "b" + "c";
        String b = "abc";
        //TODO: find out why a == b returns true
        //are they equal?
        testEquality(a, b);
        a = b;
        //are they equal now?
        testEquality(a, b);

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
}
