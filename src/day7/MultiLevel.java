package day7;



class GP
{

	public void GPshow()
	{
		System.out.println("I am Grand Parent");
	}
	
}

class P extends GP
{
	public void Pshow()
	{
		System.out.println("I am Parent");
	}
}
class C extends P
{
	public void Cshow()
	{
		System.out.println("I am Child");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		
		C c =new C();
		c.Cshow();
		c.Pshow();
		c.GPshow();
		
		System.out.println("***********************************");
		
		P p=new P();
		p.Pshow();
		p.GPshow();
	
		
		System.out.println("***********************");
		GP gp=new GP();
		gp.GPshow();
				
		
		

		
		
		
		
		
				

	}
}



