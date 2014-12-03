//Written by Megan Avery
public class PillowPetClient {

	public static void main(String[] args) {
		
		PillowPet basic = new PillowPet(); //creates a basic PillowPet
		System.out.println("BASIC POST CREATION: " + basic.toString() + "\n");
		
		basic.grow(5); //grow basic by 5 feet
		System.out.println("BASIC POST GROW BY 5: " + basic + "\n"); //just printing out the object by name will automagically call the toString()
		
		basic.shrink(3); //shrink basic by 3 feet
		System.out.println("BASIC POST SHRINK BY 3: " + basic + "\n");
		
		basic.snuggle(); //yay!
		System.out.println(); 
		
		basic.changeAnimal("dinosaur");
		System.out.println("BASIC POST ANIMAL CHANGE: " + basic + "\n");
		
		basic.color = "blue"; //now I have a blue pillow pet
		System.out.println("BASIC POST COLOR CHANGE: " + basic + "\n");

		
		//Toy t = new Toy();  WHY CAN'T I DO THIS?? <- because you can't create objects that are interfaces directly
		
		Toy t = new PillowPet(); //WHY CAN I DO THIS?? <- because a PillowPet is a Toy 
		
		//this would cause an error because the COMPILER sees t as a Toy and Toy doesn't have a snuggle method
		//t.snuggle(); <- ERROR
		
		//I have to cast t to a PillowPet so that the compiler can see its snuggle method
		((PillowPet)t).snuggle(); 
	}

}
