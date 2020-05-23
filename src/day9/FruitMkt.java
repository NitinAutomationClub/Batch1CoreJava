package day9;
/*
 * 1.Interface are similar to Abstract class but having all methods of abstract type
 * 2. It means method with body is not possible
 * 3. interface is the blueprint of the class to specify what a class must do not how
 * 4. It support Multiple Inheritance through Interface
 * 5. We cann't create object 
 * 6. We cann't create constructor
 * 7 We use implements keyword to inherit the parent interface class
 * 8. Java 8 version they allow us to create concrete method (method with body) but we need to mention 
 * "default" keyword before method name
 */

public interface FruitMkt {
	int l=20;
	final static int j=40;
	//By default final , static 
	
	/*FruitMkt()
	{
		System.out.println("");
	}*/
	//Not possible
	/*public void show()
	{
		
	}*/
	default void show()
	{
		System.out.println("Show method in fruit markt interface");
	}
	
	public void tasty();
	//FruitMkt obj=new FruitMkt();//Not possible to create object
	
}
