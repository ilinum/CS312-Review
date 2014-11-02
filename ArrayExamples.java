import java.util.Arrays;

/**
 * Created by Svyatoslav Ilinskiy on 11/1/14.
 */
public class ArrayExamples {

    public static void main(String[] args) {
//        defaultValuesInt();
//        defaultValuesDouble();
//        defaultValuesBooleans();
//        defaultValuesStrings();
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
        //what do all values contain?
        System.out.println(Arrays.toString(stringArray));
    }
}
