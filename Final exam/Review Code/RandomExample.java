import java.util.*;


public class RandomExample {
	public static void main(String[] main){
		
		Random rand = new Random();
		
		int x = rand.nextInt(5); // [0, 5) so really 0 - 4
		int z = rand.nextInt(5);
		int y = rand.nextInt(); //any random int possible
		
		boolean b = rand.nextBoolean();
		
		
				
		
		double d = 2*rand.nextDouble(); // 0 - .9999999
		
		System.out.println("x: " + x);
		System.out.println("z: " + z);

		System.out.println("y: " + y);
		
		Scanner scan = new Scanner("hello 22 3.0 56 tree");
		
		//Scanner stuff
		System.out.println();
		while(scan.hasNext()){
			
			if(scan.hasNextDouble())
				System.out.println("DOUBLE " + scan.nextDouble());
			else if(scan.hasNextInt())
				System.out.println("INT " + scan.nextInt());
			else 
				System.out.println("STRING " + scan.next());
			
		}
		
		

	}
}
