package day7;

/*Inheritance : 
 1. Is the procedure by which one object acquires all the properties and behaviour of parent object
 2. We can achieve inheritance b using extends keyword
 3. Inheritance is tightly coupled with each other
 4. Private methods not extended by child 

Child obj=new Child() ;  Access Child and Parent Methods

Parent obj1=new Parent(); Access only Parent method

Parent obj2=new Child(); By using parent reference we can call only parent method available in parent class 
*
* Child obj3=new Parent(); //Not Possible
*/

class Parent
{

	public void Pshow()
	{
		System.out.println("I am Parent");
	}
	
	private void set()
	{
		System.out.println("Set method from parent class");
	}
	
protected void get()
{
	System.out.println("Get method from parent class");
}
}

class Child extends Parent
{
	public void Cshow()
	{
		System.out.println("I am Child");
	}
}

public class Inher {

	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.Cshow();
		obj.Pshow();
		//obj.set();
		obj.get();
		
		System.out.println("***********************************");
		Parent obj1=new Parent();
		obj1.Pshow();
		
		System.out.println("***********************");
		Parent obj2=new Child();
		obj2.Pshow();
		obj2.get();
		
		
		
		
		
				

	}
}



