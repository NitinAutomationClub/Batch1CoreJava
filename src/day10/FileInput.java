package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
 * try{
 * risky code
 * }
 * catch (Exception name refernce variable)
 * {
 * }
 * try , catch , finally , throw throws
 */

public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100 , b=0 ,c;
		System.out.println("1");
		try
		{
		System.out.println("2");
		c=a/b;
		System.out.println("Value is: "+c);
		System.out.println("3");
		}
		catch(Exception e)
		{
			System.out.println("4");
			System.out.println("Hey !! You can't divide by zero ::::" + e);
			System.out.println("5");
		}

	finally
	{
		System.out.println("Connection close");
	}
	}

}
