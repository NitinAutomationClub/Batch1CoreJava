package day9;

public abstract class Bank {
	int i=10;
	static String name="Core Java";
	final int k=20;
	
	
	  Bank()
	  {
		  System.out.println("Bank Constructor");
	  }
	
	public void creditcard()//Non Abstract Method
	{
		System.out.println(" Bank Credit Card");
	}

	public abstract void loan();//Abstract Method
	
	
}
