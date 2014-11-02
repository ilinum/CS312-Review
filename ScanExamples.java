package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ScanExamples
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//Examine the following examples and determine whether or not they will produce the expected output:
		
		//EXAMPLE A:
		//test1.txt contains a list of integers, one on each line
		Scanner scan = new Scanner(new File("test1.txt"));
		System.out.println(countNumbers1(scan));
		
		//EXAMPLE B:
		//test2.txt contains a list of scores. The first line holds a name, second a score,
		//third a name, fourth a score, and so on.
		scan = new Scanner(new File("test2.txt"));
		System.out.println(countNumbers2(scan));
		
		//EXAMPLE C:
		//test3.txt contains a list of scores for each student over the course of the semester. 
		//The first line holds a name - first and last, the second a list of scores separated by at least one space
		//third a name, fourth a list of scores separated by at least one space, and so on.
		//The file terminates in a blank line
		scan = new Scanner(new File("test3.txt"));
		countNumbers3(scan);
		
		//EXAMPLE D:
		//test4.txt contains a list of rankings. The first line says how many people are ranked.
		//The next line after that contains a name followed by their rank. 
		//Each rank will be in the range: [1,x] where x is the number.
		//The file terminates in a blank line
		scan = new Scanner(new File("test4.txt"));
		printByRank(scan);
		
		//EXAMPE E:
		//Write a method containsNumber(Scan scan, int n)
		//Returns true if the number n is present in the file, and false otherwise
		scan = new Scanner(new File("test4.txt"));
		boolean b = containsNum(scan, 4);
		
		scan.close();
	}
	
	//EXAMPLE A:
	//Method should return sum of numbers in file test1.txt
	//Does the following work?
	public static int countNumbers1(Scanner scan)
	{
		int count = 0;
		while(scan.hasNextInt())
		{
			count += scan.nextInt();
		}
		return count;
	}
	
	//EXAMPLE B:
	//Method should return sum of numbers in file test2.txt
	//Does the following work? 
	public static int countNumbers2(Scanner scan)
	{
		int count = 0;
		while(scan.hasNextInt())
		{
			count += scan.nextInt();
		}
		return count;
	}
	
	//EXAMPLE C:
	//Method should print names and sum of scores in the form:
	//FirstName LastName: sum
	//Does the following work? 
	public static void countNumbers3(Scanner scan)
	{
		while(scan.hasNextLine())
		{
			String name = scan.nextLine();
			int score = 0;
			while(scan.hasNextInt())
			{
				score += scan.nextInt();
			}
			System.out.println(name + ": " + score);
		}
	}
	
	//EXAMPLE D:
	//Does the following work?
	public static void printByRank(Scanner scan)
	{
		String[] namesInOrder = new String[scan.nextInt()];
		scan.nextLine();
		
		while(scan.hasNextLine())
		{
			String name = scan.next();
			namesInOrder[scan.nextInt()] = name;
			scan.nextLine();
		}
		
		for (int i = 0; i < namesInOrder.length; i++)
		{
			System.out.println(namesInOrder[i]);
		}
	}
	
	//EXAMPLE E:
	public static boolean containsNum(Scanner scan, int n)
	{
		return true;
	}
	
	






	
	/*ANSWERS*/
	
	//EXAMPLE A: Works as is
	
	//EXAMPLE B: Has next only looks at next token
	public static int countNumbers2Fixed(Scanner scan)
	{
		int count = 0;
		while(scan.hasNext())
		{
			if (scan.hasNextInt())
				count += scan.nextInt();
			else
				scan.next();
		}
		return count;
	}
	
	//EXAMPLE C: need to add scan.nextLine() on 141
	public static void countNumbers3Fixed(Scanner scan)
	{
		while(scan.hasNextLine())
		{
			String name = scan.nextLine();
			int score = 0;
			while(scan.hasNextInt())
			{
				score += scan.nextInt();
			}
			scan.nextLine();
			System.out.println(name + ": " + score);
		}
	}
	
	//EXAMPLE D:
	public static void printByRankFixed(Scanner scan)
	{
		String[] namesInOrder = new String[scan.nextInt()];
		scan.nextLine();
		
		while(scan.hasNextLine())
		{
			String name = scan.next();
			namesInOrder[scan.nextInt() - 1] = name;
			scan.nextLine();
		}
		
		for (int i = 0; i < namesInOrder.length; i++)
		{
			System.out.println(namesInOrder[i]);
		}
	}
	
	//EXAMPLE E:
	public static boolean containsNumAnswer(Scanner scan, int n)
	{
		while(scan.hasNext())
		{
			if (scan.hasNextInt())
			{
				int num = scan.nextInt();
				if (num == n)
					return true;
			}
			else
				scan.next();
		}
		return false;
	}
	
}