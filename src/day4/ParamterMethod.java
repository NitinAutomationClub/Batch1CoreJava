package day4;

public class ParamterMethod {
public void sum()
{
	int a=30;
	int b=20;
	int c;
	c=a+b;
	System.out.println("Sum is "+c);
}


public void mul(int a, int b,int d)
{
	int c;
	c=a*b*d;
	System.out.println("Multiply "+ c);
}


	
	public static void main(String[] args) {
		ParamterMethod obj=new ParamterMethod();
		obj.sum();
		obj.mul(4, 5,6);
		
		obj.mul(10, 30,7);
		obj.mul(10, 40,8);
		obj.mul(2, 3,9);
		

	}

}
