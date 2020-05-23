package day3;

public class StaticDemo {
	
	static int i=10;
	static 
	{
		System.out.println("Inside Static");
	}

	public static void main(String[] args) {
		
		System.out.println("Inside Main method");
		System.out.println(i);
		
	}

}
