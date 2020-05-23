package day9;

/* Abstraction is use for Security purpose.
 * 
 * Definition : Abstraction is hiding implementation and just highlighting the setup 
 * services that we are offering
 * Example ATM, Car we don't know internal implementation
 * 
 * We can achieve  Abstraction by :
 * 
 * 1. Abstract Class (0-100% security achieve)
 * 2. Interface Class (100%  security achieve)
 * 
 * 
 * Points to Remember for Abstract Class
 * 1. A method  without body (no implementation) is known as abstract method
 * 2. If any class is having abstract method then it is compulsory to make that class abstract
 * 3. It is not compulsory that if any class is abstract class than method also be abstract
 * 4. If any child classes extend Abstract class then it is compulsory for child class to 
 *    implement the abstract method 
 * 5. We can't create object for Abstract class  
 *  6. Required : When business logic need to update or create
 */
public abstract class AbstractionNotes {

	public abstract void floor2();//Abstract Method
	public abstract void floor3();//Abstract Method
	
	
	public  void floor1()//Non Abstract Method or Regular method
	{
		System.out.println("3 BHK");
		System.out.println("Vastu");
		System.out.println("2 Washroom ");
	}
	public static void main(String args[])
	{
		//AbstractionNotes obj=new AbstractionNotes();
		
	}
	
}
