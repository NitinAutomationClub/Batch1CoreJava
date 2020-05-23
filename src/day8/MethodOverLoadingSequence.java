package day8;

public class MethodOverLoadingSequence {

	
	public void show(int a , String b)
	{
		System.out.println("Show 1");
	}
	public void show(String b,int a)
	{
		System.out.println("Show 2");
	}
	public static void main(String[] args) {
		
		MethodOverLoadingSequence obj=new MethodOverLoadingSequence();
		obj.show(1, "Core Java");
		obj.show("test", 2);
	}

}
