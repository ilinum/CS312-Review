import java.util.ArrayList;

//written by Megan Avery
//an object that is an army of PillowPets!! The world doesn't stand a chance
public class PillowPetArmy {
	private ArrayList<PillowPet> troops; //an ArrayList of PillowPets! WHAT?!
	private int attackStrength;
	private String warCry;
	private int defense;
	
	//default constructor
	public PillowPetArmy(){
		troops = new ArrayList<PillowPet>(); //actually creates troops
		attackStrength = 5;
		warCry = "IT'S A PILLOW... IT'S A PET!!";
	}
	
	//constructor for if client just wants to specify attackStrength
	public PillowPetArmy(int attackStrength){
		troops = new ArrayList<PillowPet>(); //actually creates troops
		this.attackStrength = attackStrength;
		warCry = "IT'S A PILLOW... IT'S A PET!!";
	}
	
	public PillowPetArmy(int attack, int defense){
		
	}
	
	//constructor for if client wants to specify everything
	public PillowPetArmy(int attackStrength, String warCry){
		troops = new ArrayList<PillowPet>(); //actually creates troops
		this.attackStrength = attackStrength;
		this.warCry = warCry;
	}
	
	//add a PillowPet to my army
	public void enlist(PillowPet p){
		if(troops.size() == 50)
			System.out.println("already reached max number of troops");
		else
			troops.add(p);
	}
	
	//removes a PillowPet from the army based on its position in the army
	public void discharge(int position){
		if(position < 0 || position >= troops.size())
			throw new IllegalArgumentException("Tried to discharge a troop that didn't exist");
		if(troops.size() == 2)
			System.out.println("Army already at minimum capacity");
		else
			troops.remove(position);
	}
	
	//remove all pillow pets of a certain type from the army... 
	//returns the number of victims of the genocide
	public int genocide(String animal){
		int victims = 0;
		
		for(int i = 0; i < troops.size(); i++){
			if(troops.get(i).getAnimal().equals(animal)){ //do all the dots make your head spin? 
				discharge(i);						//just keep track of what type of variable you have
				i--; //need to do this because now the size has gone down by one and this changes the number of loop runs
				victims++;
			}
		}
		
		return victims;
	}
	
	//this method is for when PillowPet armies fight each other
	//returns true if this PillowPet wins (or there is a tie) and false if it looses
	//winning is determined by relative attackStrength
	public String fight(PillowPetArmy opponent){
		if(this.attackStrength > opponent.attackStrength) //why can I use the .notation here when attackStrength is private? 
			return "VICTORY";								//ANSWER: because I'm still inside the PillowPetArmy class  
		else if(this.attackStrength == opponent.attackStrength)
			return "TIE";
		return "BITTER DEFEAT";										
	}
	
	//all the troops in my army grow one foot
	//my attack strength increases by 1 if my number of troops is is a multiple of ten
	public void levelUp(){
		for(PillowPet p: troops)
			p.grow(1);
	    if(troops.size() % 10 == 0)
	    	attackStrength++;
	}
	
	//returns the warCry
	public String intimidate(){
		return warCry;
	}
	
	//what I want to return if I print out this army
	public String toString(){
		ArrayList<String> animals = new ArrayList<String>();
		
		for(PillowPet p: troops){
			String animal = p.getAnimal();
			if(!animals.contains(animal))
				animals.add(animal);
		}
		
		int[] animalCnts = new int[animals.size()];
		for(PillowPet p: troops){
			String animal = p.getAnimal();
			animalCnts[animals.indexOf(animal)]++;
		}
		
		String output = "";
		
		for(int i = 0; i < animals.size(); i++){
			output += animalCnts[i] + " " + animals.get(i);
			if(animalCnts[i] > 1)
				output += "s";
			output += "\n";
		}
		
		if(output.length() == 0)
			return "There are no troops in the army\n";
		return output;
							
	}
}
