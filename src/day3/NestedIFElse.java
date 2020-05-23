package day3;

public class NestedIFElse {
	//Wap to find the highest no.
	// false and false=false
	// true and true=true
	//false and true=false
	
	public static void main(String[] args) {
	int a=300;
	int b=800;
	int c=900;
	if(a>b && a>c)
	{
		System.out.println("A is greater");
	}
	else if(b>a && b>c)
	{
		System.out.println("B is greater");
	}
	else
	{
		System.out.println("C is greater");
	}
	
	
	

	}

}
