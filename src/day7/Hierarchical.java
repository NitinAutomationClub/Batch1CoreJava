package day7;



	class A
	{
		public void aShow()
		{
			System.out.println("A method");
		}
	}
	
	class B extends A
	{
		public void bShow()
		{
			System.out.println("B method");
		}
	}
	
	class CC extends A
	{
		public void cShow()
		{
			System.out.println(" C method");
		}
	}
	
	public class Hierarchical {
		
	public static void main(String[] args) {
		
		CC cc=new CC();
			cc.cShow();
			cc.aShow();
			System.out.println("**********************");
			B b=new B();
			b.aShow();
			b.bShow();
			System.out.println("**********************");
			A a=new A();
			a.aShow();

	}

}
