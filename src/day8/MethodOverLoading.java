package day8;

public class MethodOverLoading {
	
	/*
	 * Method OverLoading Rules : 
	 * 1. Method name should be same
	 * 2. Same method should be in same class
	 * 3. Different Arguments
	 *    a. No. of argument 
	 *    b. Sequence of argument
	 *    c. Type of Argument  
	 */
	public void show()//0
	{
		System.out.println("Show 1");
	}
	public void show(int a)//1
	{
		System.out.println("Show 2");
	}

	public static void main(String[] args) {
		
		MethodOverLoading obj=new MethodOverLoading();
		
		obj.show();
		obj.show(10);
	}

}
