import java.util.ArrayList;

//hopefully helpful ArrayListExamples
public class ArrayListExamples {
	public static void main(String[] args){
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		System.out.println(nums.size());
		
		//nums.get(0); //<- causes compiler error since ArrayLists are created with nothing in them
		nums.add(0, 1); //adds at a particular position
		nums.add(0, 2);
		System.out.println(nums);
		nums.add(54); //adds to the end
		System.out.println(nums);
		
		nums.add(3, 7);
		System.out.println(nums);
		
		nums.add(3, 4); //adding in middle causes everything else to be scooted down
		System.out.println(nums);

		nums.set(0, 3); //sets a particular spot to a value
		System.out.println(nums);
		
		nums.add(6);
		nums.add(5);
		System.out.println(nums);
		
		//An ArrayList of ArrayLists, not important for the exam just interesting
		ArrayList<ArrayList<Integer>> d = new ArrayList<ArrayList<Integer>>();

		
	}

}
