package day10;

/*Defination:Grouping of data members and corresponding methods into a single 
 * unit is called Encapsulation
 * Steps to achieve
 * 1. Declare the data members as Private
 * 2. Provide public setter and getter method to modify and view the variable values
 */
class Emp
{
	private int adhar;//Data Hide
	private String name;//Data Hide
	int age;
	
	public int getAdhar() {
		return adhar;
	}
	public void setAdhar(int adhar) {
		this.adhar = adhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Encapsulation {
	
	public static void main(String args[])
	{
	Emp obj=new Emp();
	//Set the value
	obj.setAdhar(102);
	obj.setName("James");
	
	
	
	// To retrieve the value
	
	System.out.println("Adhar number is "+ obj.getAdhar());
	System.out.println("Name is "+ obj.getName());
	obj.age=20;
	System.out.println("Age is "+ obj.age);
	
	
}
}