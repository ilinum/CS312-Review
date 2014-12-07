import java.util.ArrayList;

public class MyStringStack1 implements MyStack {
	//Use an ArrayList for the container
	ArrayList<String> container;
	
	//Constructor
	public MyStringStack1(int maxSize)
	{
		 container = new ArrayList<String>(maxSize);
	}
	
	//Put a String on the top
	public void putOnTop(String s)
	{
		container.add(s);
	}
	
	//Take top String out of stack
	public String takeOffTop()
	{
		if (!isEmpty())
		{
			return container.remove(container.size() - 1);
		}
		
		return null;
	}
	
	//Return true if the class is empty
	public boolean isEmpty()
	{
		return container.isEmpty();
	}
	
	//Print representation of stack.
	//In the representation, indicate the top and bottom of the stack
	public String toString()
	{
		String s = "";
		s += "TOP\n";
		s += "----------\n";
		for (int index = container.size() - 1; index >= 0; index--)
		{
			s += container.get(index);
			s += "\n";
		}
		s += "----------\n";
		s += "BOTTOM\n";
		
		return s;
	}
}
