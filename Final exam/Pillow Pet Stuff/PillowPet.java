//written by Megan Avery
//a fun Object example
public class PillowPet implements Toy {
	//what kind of attributes would a PillowPet have??
	//we made them private because we don't want the user to be able to edit them directly
	
	private String animal; //not accessible by the client because it is private <- the user is not worthy of touching the animal variable directly what if they create a monster?!
	public String color; //the client can manipulate because it is public (if no keyword then variable is public)
	private int size; //in feet! :)
	private String name;
	
	//default Constructor, what we want a "basic" PillowPet to be like
	public PillowPet(){
		animal = "kangaroo";
		color = "lime green";
		size = 1;
		name = "Kanga";	
	}
	
	//other Constructor, the creator gets to pick what their PillowPet is like
	public PillowPet(String ani, String color, int size, String name){
		animal = ani;
		this.color = color;
		this.size = size;
		this.name = name;
	}
	
	//another Constructor with different parameters, can have as many Constructors as you need as long as they have a different parameter pattern
	public PillowPet(String ani){
		animal = ani;
		color = "lime green";
		size = 1;
		name = "Kanga";		
	}
	
	//what kind of things do we want the PillowPet to be able to do??
	
	//makes the PillowPet "grow" by the given amount
	//HERE BECAUSE PILLOWPET IS A TOY
	public void grow(int amount){
		size += amount;
	}
	
	//makes PillowPet "shrink" by the given amount
	//HERE BECAUSE PILLOWPET IS A TOY
	public void shrink(int amount){
		size -= amount;
	}
	
	//makes your PillowPet snuggle with you!
	public void snuggle(){
		System.out.println(name + " loves you! *HUG*");
	}
	
	//COULD ADD IN GETTERS AND SETTERS TO LET THE USER MESS WITH THE ATTRIBUTES
	//but as the programmer we are in charge of these so we have the power!
	//why do we have this sort of power? because users are not to be trusted!
	
	//example: a setter for the animal variable
	public void changeAnimal(String ani){
		animal = ani;
	}
	
	//example: a getter for the animal variable
	public String getAnimal(){
		return animal;
	}
	
	//what we want to print out when a PillowPet is printed
	public String toString(){
		String unit = "feet";
		if(size == 1) 
			unit = "foot";
		return name + " is a " + color + " " + animal + " that is " + size + " " + unit + " long.";
	}

}
