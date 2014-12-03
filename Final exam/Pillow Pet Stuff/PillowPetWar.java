//Written by Megan Avery
//a runner class for the PillowPet Army class
public class PillowPetWar {
	public static void main(String[] args){
		PillowPetArmy one = ArmyOne();
		
		//now to create a second army to pit against Army 1
		//NOTE: there will only ever be 2 armies in by war
		PillowPetArmy two = ArmyTwo();
		
		//two.troops.get(0); //bad syntax
		
		System.out.println("Army 1 is fighting Army 2: " + one.fight(two) + " for Army 1");

	}
	
	//creates and plays around with Army 1 of this war
	public static PillowPetArmy ArmyOne(){
		System.out.println("CREATING ARMY 1");
		PillowPetArmy one = new PillowPetArmy(); //I have created a basic empty PillowPetArmy
		System.out.println("Army 1 right after creation: \n" + one);
		
		one.enlist(new PillowPet());
		System.out.println("Army 1 right one basic enlistment: \n" + one);
		
		one.enlist(new PillowPet("alligator"));
		System.out.println("Army 1 after enlisting an alligator: \n" + one);
		
		//what if I want to enlist 10 rabbits at once?!
		for(int i = 0; i < 10; i++)
			one.enlist(new PillowPet("rabbit"));
		System.out.println("Army 1 after enlisting 10 rabbits: \n" + one);
		
		//just for kicks let's now kill off all the rabbits in army one
		one.genocide("rabbit");
		System.out.println("Army 1 after genocide of the rabbits: \n" + one);
		
		return one;
	}
	
	//creates and adds to Army 2 of this war
	public static PillowPetArmy ArmyTwo(){
		System.out.println("CREATING ARMY 2");
		PillowPetArmy two = new PillowPetArmy(10);
		
		two.enlist(new PillowPet("longhorn", "burnt orange", 20, "bevo"));
		
		for(int i = 0; i < 60; i++)
			two.enlist(new PillowPet("prairie dog", "brown", 2, "prarie dog" + (i+1)));
		
		//one longhorn and 60 prarie dogs agains the world
		System.out.println("Army 2 after its full creation and enlistment: \n" + two);
		return two;
	}
	
	
}
