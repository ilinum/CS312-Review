import java.util.Random;

/**
 * Created by Svyatoslav Ilinskiy on 11/2/14.
 *
 * Class that contains following examples concerning Strings:
 *
 * 1. String equality
 * 2. Strings as parameters
 * 3. String methods (charAt(), indexOf(), contains(), substring()). Not going to go all over them here.
 *
 * A lot of String methods you need to know are here:
 * http://www.cs.utexas.edu/~scottm/cs312/handouts/slides/topic13_procedural_design.pdf
 */
public class StringExamples {

    public static void main(String[] args) {
//        stringEquality();1
//        stringAsParameters();
//        workWithStrings();

//        int[] a = {2, 7, 12};
//        int[] b = {1, 7, 13};
//        int[] c = getMerge(a,b);
//        String s = Arrays.toString(c);

//        rollUntilSame(5);

//        System.out.println(countOccurences("aabbaaacd", "aa"));


        //examples to do
        //1. Implement indexOf()
        //2. Implement contains()
        //3. Implement replace(str1, str2, str3)
        //4. Implement substring()
        //5. Implement startsWith()
        //6. Implement endsWith()
        //7. Implement toUpperCase()
        //8. Reverse characters in a String
        //9. Make all lower case letters upper case and all upper case lower case
        //10. Implement insert(int charToInsert, int indexToInsertAt)
        //11. Count number of occurrences of a String in a String  <------- did this one!
        //12. Merge two Strings together (for example, example mergeString("abcd", "efgh") would return "arbfcgdh")
    }


    /**
     * method that provides examples about String equality
     */
    public static void stringEquality() {
        String a = "abc";
        String b = "abcd";
        String c = "abc" ; //b.substring(0, 3); //"abc"
        c = new String("abc");
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
        System.out.printf("String a: %s, String b: %s\n", a, b);
        System.out.println("a == b: " + (a == b)); //BAD. VERY BAD
        System.out.println("a.equals(b): " + (a.equals(b)));
    }

    /**
     * Method that provides some example for Strings used as parameters
     */
    public static void stringAsParameters() {
        String b = "abc";
        manipulateString(b);
        System.out.println(b);
    }

    /**
     * b helper method for stringAsParameters().
     * @param b String passed in
     */
    public static void manipulateString(String b) {
        b += "d"; //same as b = new String(b + "d");
        System.out.println(b);
        b = "ef";
        System.out.println(b);
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
        String c = a.substring(3, 7);
        System.out.println("a: " + a);
        System.out.println("c: " + c);
        //what will happen if you do this?
        String d = a.substring(3, 1);
    }

    //problem 7 from Fall 2013 Midterm 2
    //method that rolls the dice until all dice are same
    //num is the number of dice we have
    public static void rollUntilSame(int num) {
        Random r = new Random();
        boolean done = false;
        int roundsPlayed = 0;
        while (!done) {
            done = true;
            int[] throwsThisRound = new int[num];
            for (int throwDice = 0; throwDice < num; throwDice++) {
                int th = r.nextInt(6) + 1;
                throwsThisRound[throwDice] = th;
                System.out.print(th + " ");
                if (throwsThisRound[0] != throwsThisRound[throwDice]) {
                    done = false;
                }
            }
            System.out.println();
            roundsPlayed++;
        }
        System.out.printf("Played %d rounds", roundsPlayed);
    }

    //Method that returns int array that is the merge of two sorted arrays
    public static int[] getMerge(int[] a, int[] b) {
        int[] sorted = new int[a.length + b.length];
        int indexA = 0;
        int indexB = 0;
        int indexSorted = 0;

        while (indexA < a.length && indexB < b.length) {
            if (a[indexA] < b[indexB]) {
                sorted[indexSorted] = a[indexA];
                indexA++;
                indexSorted++;
            }
            else if (a[indexA] > b[indexB]) {
                sorted[indexSorted] = b[indexB];
                indexB++;
                indexSorted++;
            }
            else {
                sorted[indexSorted] = b[indexB];
                indexSorted++;
                sorted[indexSorted] = a[indexA];
                indexSorted++;
                indexB++;
                indexA++;
            }
        }

        while (indexSorted < sorted.length) {
            if (indexA < a.length) {
                sorted[indexSorted] = a[indexA];
                indexSorted++;
                indexA++;
            }
            else {
                sorted[indexSorted] = b[indexB];
                indexSorted++;
                indexB++;
            }
        }

        return sorted;
    }

    /**
     * method that counts occurences of a particular String in another string.
     * It would be much easier implemented using substring() and indexOf() methods
     * @param original the String to look for occurences in
     * @param target the "target" String we're looking for
     * @return number of occurences of String target in String original.
     *          returns original.length() if target.length() == 0
     */
    public static int countOccurences(String original, String target) {
        int occurrences = 0;
        for (int i = 0; i < original.length(); i++) {
            int j = i;
            int k = 0;
            boolean done = false;
            boolean occurred = true;
            while (!done) {
                if ((j >= original.length()) && (k < target.length())) { //original ended before k ended
                    done = true;
                    occurred = false;
                } else if ((j >= original.length()) || (k >= target.length())) { //we are out of bounds for both strings
                    done = true;
                } else if (original.charAt(j) != target.charAt(k)) { //we're in bounds, let's check!
                    occurred = false;
                }
                k++;
                j++;
            }
            if (occurred) {
                occurrences++;
            }
        }
        return occurrences;
    }

}

