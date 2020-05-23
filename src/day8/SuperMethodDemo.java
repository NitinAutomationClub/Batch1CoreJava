package day8;

class AAA
{
	AAA()
	{
		System.out.println("Inside Parent const");
	}
	void m1()
	{
		System.out.println("Inside Parent Class method");
	}
}

public class SuperMethodDemo extends AAA {
	
	SuperMethodDemo()
	{
		//super();
		System.out.println("Inside Child cons");
	}
	void m1()
	{
		System.out.println("Inside Child Class method");
		
	}
	void show()
	{
		//System.out.println("Inside Show method");
		m1();
		super.m1();
	}

	public static void main(String[] args) {
		SuperMethodDemo obj=new SuperMethodDemo();
		obj.show();
		
		//System.out.println("Out from methods");

	}

}
