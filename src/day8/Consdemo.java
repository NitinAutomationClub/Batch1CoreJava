package day8;

class conparent
{
	conparent()
	{
		System.out.println("Parent Constructor");
	}
}

public class Consdemo extends conparent {
	
	Consdemo()
	{
		System.out.println("Child Constructor");
	}

	public void show()
	{
		System.out.println("show method inside child class");
	}
	public static void main(String[] args) {
		Consdemo obj=new Consdemo();
		obj.show();
		

	}

}
