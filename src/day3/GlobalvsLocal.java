package day3;

public class GlobalvsLocal {
/*Variable is the name of memory allocation that store the data
 * 
 * 1 Global Variable/ Instance Variable /Class Variable
  2. Local Variable
  3. Static variable
	*/
	
	int a=10;//Global Variable
	String name="Nitin";//Global Variable
	
	public void test()
	{
		int k=20;//Local variable
		System.out.println("Inside test method : "+k);
		System.out.println("value of a"+a);
	
	}
	public static void main(String[] args) {
		int j=30;//local variable
		
		GlobalvsLocal obj=new GlobalvsLocal();
		System.out.println(obj.a);//10
		
		System.out.println(obj.name);//Nitin
		System.out.println(j);
		//System.out.println(k);//error
		obj.test();
		
		
		

	}

}
