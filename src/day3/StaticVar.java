package day3;

public class StaticVar {

	String name="Core Java";
	static int i=10;
	static int j=20;
	
	public void run()
	{
		
		System.out.println("Non Static method");
	}
	public static void test()
	{
		
		System.out.println("Static method");
	}
	public static void main(String[] args) {
	
		System.out.println("Static variable inside Class : "+i);
		System.out.println("Static variable inside Class: "+j);
		StaticVar obj=new StaticVar();
		System.out.println(obj.name);
		
		
		test();//Least recommended
		StaticVar.test();//Most Preferabble
		
		obj.test();// Not recommended
		
		obj.run();//Non Static Method
		
		
		
	}

}
