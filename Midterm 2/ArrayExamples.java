import java.util.Arrays;

/**
 * Created by Svyatoslav Ilinskiy on 11/1/14.
 *
 * Class that contains following examples concerning arrays:
 *
 * 1. Accessing elements
 * 2. DefaultValues
 * 3. Passing arrays as parameters
 * 4. Assigning arrays to each other
 * 5. Testing arrays for equality
 *
 */
public class ArrayExamples {

    public static void main(String[] args) {
//        accessElements();
//        defaultValuesInt();
//        defaultValuesDouble();
//        defaultValuesBooleans();
//        defaultValuesStrings();
//        arraysAsParametersEasy();
//        arraysAsParametersHard();
//        arraysSet();
//        arrayEquality();
        
//        int[] a = {1, 2, 3, 4, 5, 6};
//        reverseElementsInArray(a);
//        System.out.println(Arrays.toString(a));


        //examples to do:
        //1. Write a method that reverses all elements in the array
        //2. Write a method that switches every two adjacent values in an array
        //3. Find a mode in an array
        //4. Merge two sorted arrays
        //5. Determine how many elements in a String array are set to null
        //More examples here: http://www.cs.utexas.edu/~scottm/cs312/handouts/slides/topic25_more_array_algorithms.pdf
    }

    /**
     * Method with an example how to access elements
     */
    public static void accessElements() {
        int[] array = {10, 2, 4, 1, 3, 6};
        //we access:
        // first element: a[0]
        // last element a[n - 1] where n is the length of the array
        System.out.println(array[0]); //what will this print?
        System.out.println(array[4]);
        System.out.println(array[5]);
//        System.out.println(array[6]);
        printArray(array);
        //let's print all of the values!
        //we could use Arrays.toString(array) but that's too easy
    }

    /**
     * prints an array. You could just use Arrays.toString(array)
     * @param array array to print
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * This method contains examples for default values of array of int
     */
    public static void defaultValuesInt() {
        int[] intArray = new int[10];
        //what is in intArray[9]?
        System.out.println("intArray[9]: " + intArray[9]);
        //what is in intArray[5]?
        System.out.println("intArray[5]: " + intArray[5]);
        //what do all values contain?
        System.out.println(Arrays.toString(intArray));

        intArray[5] = 2;
        System.out.println("\nWe changed intArray[5] = 2. Now intArray is: ");
        //what does intArray contain now?
        System.out.println(Arrays.toString(intArray));
    }

    /**
     * This method contains examples for default values of array of doubles
     */
    public static void defaultValuesDouble() {
        double[] doubleArray = new double[10];
        //now, arrays of doubles are pretty similar to arrays of ints
        //what is in doubleArray[6]?
        System.out.println("doubleArray[6]: " + doubleArray[6]);
        //what do all values contain?
        System.out.println(Arrays.toString(doubleArray));
    }

    /**
     * This method contains examples for default values of array of booleans
     */
    public static void defaultValuesBooleans() {
        boolean[] booleanArray = new boolean[10];
        //what is in booleanArray[0]?
        System.out.println("booleanArray[0]: " + booleanArray[0]);
        //what do all values contain?
        System.out.println(Arrays.toString(booleanArray));
    }

    /**
     * This method contains examples for default values of array of Strings
     */
    public static void defaultValuesStrings() {
        String[] stringArray = new String[8];
        //what is in stringArray[2]?
        System.out.println("stringArray[2]: " + stringArray[2]);
        stringArray[2].indexOf("i");
        //what do all values contain?
        System.out.println(Arrays.toString(stringArray));
    }

    /**
     * Method with an example of an array passed as a parameter
     */
    public static void arraysAsParametersEasy() {
        int[] a = {2, 1, 5, -10};
        arrayManipulation(a);
        //what is 'a' now?
        printArray(a);
    }

    /**
     * Do some stuff with array b
     * @param b array to mess with
     */
    public static void arrayManipulation(int[] b) {
        b[3] = 0;
        b[1] = -1;
        //what does b and a have now?
        printArray(b);
        b = new int[9];
        b[3] = 1;
        printArray(b);
        b = new int[2];
        b[1] = 3;
        printArray(b);
    }

    /**
     * Method with an example of an array passed as a parameter
     */
    public static void arraysAsParametersHard() {
        int[] e = {2, 1, 5, -10, -1, 2, 6};
        printArray(e);
        arrayManipulation(e, e);
        //what is 'a' now?
        printArray(e);
    }

    /**
     * Do some stuff with 2 arrays
     * @param c first array
     * @param d second array
     */
    public static void arrayManipulation(int[] c, int[] d) {
        c[1] = -123;
        //what is d[1]?
        System.out.println("d[1]: " + d[1]);
        d[d.length - 1] = 756;
        //what is c[c.length - 1]?
        System.out.println("c[c.length - 1]: " + c[c.length - 1]);

        c[5] = d[4];
        //so c[5] is equal to d[4] now
        areEqual(c[5], d[4]);
        //is d[5] equal to c[4]
        areEqual(d[5], c[4]);
        //is d[5] equal to d[4]?
        areEqual(d[5], c[5]);
        printArray(d);
        printArray(c);
    }

    /**
     * A simple method that prints equal if two ints are equal and  "Not equal!" if they are not
     * @param a first argument
     * @param b second argument
     */
    public static void areEqual(int a, int b) {
        if (a == b) {
            System.out.println("Equal!");
        } else {
            System.out.println("Not equal!");
        }
    }

    /**
     * Method with example concerning what happens when arrays are set to each other
     */
    public static void arraysSet() {
        int[] a = {12, 2, 3, -1, 2};
        int[] b = a;
        b[3] = 52;
        //what is a[3]?
        System.out.println(a[3]);
        a[1] = 1257;
        //what is b[1]?
        System.out.println(b[1]);
    }

    /**
     * Method with an example for array equality
     */
    public static void arrayEquality() {
        int[] a = {10};
        int[] b = {10};
        //are they equal?
        testEquality(a, b);
         b = a;
//        are they equal now?
        testEquality(a, b);
        b[0] = 2;
        //are they still equal now?
        testEquality(a, b);
    }

    /**
     * Method that test if two arrays are equal in different ways
     * @param a first array
     * @param b second array
     */
    public static void testEquality(int[] a, int[] b) {
        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + (a.equals(b)));
        System.out.println("Arrays.equals(a, b): " + Arrays.equals(a, b));
    }

    /**
     * method that reverses all the elements in an array
     * @param a array to reverse. Is not changed
     * @return the reversed array
     */
    public static int[] reverseElementsInArrayNaive(int[] a) {
        int[] res = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            res[a.length - 1 - i] = a[i];
        }
        return res;
    }

    /**
     * method that reverses all the lements in an array
     * @param a array to reverse. Is changed
     */
    public static void reverseElementsInArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
    }
}
