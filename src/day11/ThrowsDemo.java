package day11;

import java.io.FileNotFoundException;


/*Throws Keyword is used to declare an exception.It gives an information to the caller method
 * that there may occur an exception ,so it is better for the caller method to provide the 
 * exception handling code, so that normal flow can be maintained
 * 
 */
class dev
{
	void read() throws ArithmeticException
	
	{
		//FileNotFoundException fis=new FileNotFoundException("d:/exception/abc1222.txt");
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);
	}
	
	/*void cal()
	{
		try
		{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e)
		{
			System.out.println("This method created by Tom Developer"+e.getMessage());
		}
	}*/
}
public class ThrowsDemo {
	
	public static void main(String[] args) {

		dev d=new dev();
		
		
		try {
			
			d.read();
		} 
		catch (ArithmeticException e) {
		
	System.out.println("This is done by developer2"+e);
		}
		//d.cal();
		
		

	}

}
