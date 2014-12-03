import java.util.Arrays;


public class ArrayStuff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// This code is to show that pointers are important and can cause weird behavior
		int[] first = {1, 2, 3, 4, 5};
		int[] second = first; //why might this be an issue?

		System.out.println("USING ==: ");
		System.out.println("PRE first: " + Arrays.toString(first));
		System.out.println("PRE second: " + Arrays.toString(second));
		System.out.println();

		first[4] = 50; //does this change the value in BOTH first and second?? or just second?
		second[0] = 10;  //again does this change the value in BOTH first and second?? or just first?

		System.out.println("POST first: " + Arrays.toString(first));
		System.out.println("POST second: " + Arrays.toString(second));
		System.out.println();

		System.out.println("first printed without toString: " + first); //showing that just printing an array prints goobly gook (aka the array address)
		System.out.println();

		//after running the program we can see any changes to one change the other
		//WHY?? because they are pointing to the same block of memory, SO BE CAREFUL WITH ARRAYS
		//if you want to copy an array over to another you have to actually copy the values over (clone?), 
		//not just set first = second

		int[] third = {1, 2, 3, 4, 5};
		int[] fourth = clone(third); //now points to a separate array with the same values
		//since we used clone the second time changes to one don't affect the other, which is 
		//usually what we really want to happen when we are programming with arrays
		//NOTE: there is an array method called clone, but we wrote our own for this code that is shown at the bottom

		System.out.println("USING CLONE:");
		System.out.println("PRE third: " + Arrays.toString(third));
		System.out.println("PRE fourth: " + Arrays.toString(fourth));
		System.out.println();

		third[4] = 50; //will these changes change the other array??
		fourth[0] = 10;

		System.out.println("POST third: " + Arrays.toString(third));
		System.out.println("POST fourth: " + Arrays.toString(fourth));
		System.out.println();

		//third and forth hold the same type of values so .equals will work
		boolean match = third.equals(fourth); //false
		System.out.println("third matches forth: " + match);
		boolean doesntMatch = !third.equals(fourth); //true
		System.out.println("third doesn't match fourth: " + doesntMatch + "\n");
		//int h = third[100]; out of bounds exception thrown since value indexes are only 0 - 4
		
		Arrays.equals(third, fourth);
		//a for each loop that prints out all the values in first
		System.out.print("FOR EACH LOOP of first: ");
		for(int x: first)
			System.out.print(x + " ");

		//equivalent to the for each loop above (pretend the y is an x)
		System.out.print("\nFOR LOOP of first: ");
		for(int i = 0; i < first.length; i++){
			int y = first[i];
			System.out.print(y + " ");
		}

		Arrays.fill(third, 5); //puts a bunch of fives in third
		System.out.println("\n\nPOST FILL third: " + Arrays.toString(third));

		third = new int[]{3, 4, 5}; //creates a new version of third at a different memory address, don't need to know exam was just asked about in review

		double [] thing = {1.0, 2.0 + .5, 'a', 3.5}; //showing that you can use addition when creating a double array AND characters
		//(since characters convert to integers which convert to doubles)

		char hello = (char)65.5; //doubles convert to characters! (the decimal part is chopped off)
		System.out.println("\n65.5 as a character: " + hello);
		
		reverse(first);
		System.out.println("\nREVERSE first: " + Arrays.toString(first));
		
		/*String blah = "hello world";
		
		for(char x: blah){
			
		}*/ //doesn't work b/c not iterable
	}

	//returns a duplicate version of first for the purposes of getting an exact copy of an array 
	public static int[] clone(int[] first){
		int[] second = new int[first.length];

		for(int i = 0;  i < first.length; i++)
			second[i] = first[i];

		return second;
	}
	
	//reverses an integer array with a loop and swapping technique
	public static void reverse(int[] arr){
		int stop = (arr.length + 1)/2;
		int end = arr.length-1;
		
		System.out.println("length " + arr.length + " stop: " + stop);
		for(int i = 0; i < stop; i++){
			int temp = arr[i];
			arr[i] = arr[end-i];
			arr[end-i] = temp;
		}
	}

}
