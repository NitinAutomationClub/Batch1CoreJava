package day9;

public class Axis extends Bank {
	
	public void loan()
	{
	System.out.println("Axis bank Loan");
		
	}
	public void creditcard()
	{
		System.out.println("Axis Bank Credt Card");
	}


	public static void main(String[] args) {
		Axis ax=new Axis();
		ax.loan();
		ax.creditcard();
		ax.i=100;
		System.out.println(ax.i);
		ax.name="Selenium";
		System.out.println(ax.name);
		System.out.println(ax.k);
		
		
		System.out.println("************************");
		//Bank bk=new Bank(); Not Possible 
		Bank bk=new Axis();
		bk.loan();//Axis Bank Loan
		bk.creditcard();//Bank Credit Card
		
		
	}

	
	
	
	
}
