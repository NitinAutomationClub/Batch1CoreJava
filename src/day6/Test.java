package day6;

public class Test {
	//This keyword refer to current class variable
	//Problem occur when class variable and local variable name are same
	// To resolve this problem ,this keyword introduced .

	int empid;
	

	void set(int empid)
	{
		empid=empid;
	
	}
	void show()
	{
		System.out.println(empid);
	}
	
	public static void main(String[] args) {
		
		Test obj=new Test();
		
		obj.set(10);
		obj.show();

	}

}
