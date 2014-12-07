
public class TestStack 
{
	public static void main(String[] args)
	{
		MyStringStack2 stack = new MyStringStack2(10);
		
		System.out.println("isEmpty(): " + stack.isEmpty());
		
		stack.putOnTop("CAT");
		stack.putOnTop("MOUSE");
		stack.putOnTop("DOG");
		
		System.out.println("isEmpty(): " + stack.isEmpty());
		
		System.out.println(stack);
		
		String str = stack.takeOffTop();
		System.out.println("Just got \"" + str + "\" off the top of the stack");
		
		System.out.println(stack);
		
		str = stack.takeOffTop();
		System.out.println("Just got \"" + str + "\" off the top of the stack");
		
		System.out.println(stack);
		
		str = stack.takeOffTop();
		System.out.println("Just got \"" + str + "\" off the top of the stack");
		
		System.out.println(stack);
		
		System.out.println("isEmpty(): " + stack.isEmpty());
	}
}
