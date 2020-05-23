package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		
		
		System.out.println("Before Try");
		
	try
		{
		
		FileInputStream fis=new FileInputStream("d:/exception/abc.txt");
		System.out.println("Inside Try");
		}
		catch(FileNotFoundException e)
		{
			
			System.out.println(e);
		}
	
		System.out.println("Out from Try and Catch Block");

	try
	{
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		
		System.out.println(e);
	}
	
	try
	{
		String name;
		name="Core Java";
		System.out.println(name.length());
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	
	}

}
