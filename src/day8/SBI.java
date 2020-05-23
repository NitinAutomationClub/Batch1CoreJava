package day8;

class ICICI extends SBI
{
	public void homeLoanInterest()
	{
		System.out.println("ICIC Home Loan Interest : 18%");
		
	}
}

public class SBI extends RBI{

	public void homeLoanInterest()
	{
		System.out.println("SBI Home Loan Interest : 15%");
		
	}
	public void CarLoan()
	{
		System.out.println("SBI Car Loan : 20%");
	}

	public void m1(String b,int a)
	{
		System.out.println("SBI method");
	}
	public static void main(String args[])
	{
		SBI sbi=new SBI();
		sbi.homeLoanInterest();
		sbi.CarLoan();
		
		sbi.m1(1, "core");
		
		
		
		System.out.println("***************************");
		RBI rbi=new RBI();
		rbi.homeLoanInterest();
		
		
		System.out.println("***************************");
		
		//Parent p=new Child();
		
		RBI p=new SBI();
		p.homeLoanInterest();//Parent class method  but JVM give priority to Chlid method
		
		System.out.println("**************************************");
		
		RBI pp=new ICICI();
		pp.homeLoanInterest();
		
		
		
		
	}
}
