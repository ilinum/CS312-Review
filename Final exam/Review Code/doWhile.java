
public class doWhile {
	public static void main(String[] args){
		//do whiles run once no matter what, that is the important thing to get from this code
		boolean x = false;
		
		do{
			System.out.println("HELLO WORLD");
			//x = true; //BAD WOULD CAUSE INFINITE LOOP
		}while(x);
		
		/*int y = 1;
		do{
			System.out.println(y);
			y++;
		}while(y > 0); //another infinite loop*/
	}

}
