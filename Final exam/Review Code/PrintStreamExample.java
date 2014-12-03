import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class PrintStreamExample {
	
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("blah3.txt");
		PrintStream hello = new PrintStream(f);
		
		hello.println("blah");
	}

}
