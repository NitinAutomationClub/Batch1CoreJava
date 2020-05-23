package day8;

public class MOverArg {

	
	public void show(int a)
	{
		System.out.println("Show 1");
	}
	public void show(String a)
	{
		System.out.println("Show 2");
	}
	public static void main(String[] args) {
	
		
		MOverArg obj=new MOverArg();
		obj.show(1);
		obj.show("Core Java");
		

	}

}
