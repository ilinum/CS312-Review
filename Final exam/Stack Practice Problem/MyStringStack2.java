
public class MyStringStack2 implements MyStack{

	private String[] container;
	private int top;

	public MyStringStack2(int maxSize)
	{
		container = new String[maxSize];
		top = -1;
	}
	
	public void putOnTop(String s) {
		container[top+1] = s;
		top++;
	}

	public String takeOffTop() {
		if (top != -1)
		{
			String str = container[top];
			top--;
			return str;
		}
		
		return null;
	}

	public boolean isEmpty() {
		return top == -1;
	}
	
	public String toString()
	{
		String s = "";
		s += "TOP\n";
		s += "----------\n";
		for (int index = top; index >= 0; index--)
		{
			s += container[index];
			s += "\n";
		}
		s += "----------\n";
		s += "BOTTOM\n";
		
		return s;
	}

}
