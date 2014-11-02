/**
 * Created by Svyatoslav Ilinskiy on 11/2/14.
 *
 * Class that contains following examples concerning Strings:
 *
 * 1. String equality
 * 2. Strings as parameters
 * 3. String methods (charAt(), indexOf(), contains(), substring()). Not going to go all over them here.
 * 4.
 *
 * A lot of String methods you need to know are here:
 * http://www.cs.utexas.edu/~scottm/cs312/handouts/slides/topic13_procedural_design.pdf
 */
public class StringExamples {

    public static void main(String[] args) {
//        stringEquality();
//        stringAsParameters();
//        workWithStrings();


        //examples to do:
        //1. Implement indexOf()
        //2. Implement contains()
        //3. Implement replace(str1, str2) <---- this one should be interesting
        //4. Implement substring()
        //5. Implement startsWith()
        //6. Implement endsWith()
        //7. Implement toUpperCase()
        //8. Reverse characters in a String
        //9. Make all lower case letters upper case and all upper case lower case

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

    /**
     * method that provides examples of working with Strings
     */
    public static void workWithStrings() {
        indexOfEx();
        substringEx();
    }

    /**
     * method that provides examples of String.indexOf()
     */
    public static void indexOfEx() {
        String a = "Hello World!";
        //what will the following line print?
        System.out.println(a.indexOf("e"));
        //what about this?
        System.out.println(a.indexOf("o"));
        //and this?
        System.out.println(a.indexOf("w"));
        System.out.println(a.indexOf("a"));
    }

    /**
     * method that provides examples for String.substring()
     */
    public static void substringEx() {
        String a = "Hello World!";
        String b = a.substring(6);
        //what is a and b now?
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        //what is c now?
        String c = a.substring(3, 6);
        //what will happen if you do this?
        String d = a.substring(3, 1);
    }
}

