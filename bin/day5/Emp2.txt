package day5;

public class Emp2 {

	
	
	String name;
	int id;
	
	public void EmpDetails(String name, int id)
	{
		this.name=name;
		this.id=id;
		System.out.println(this.name);
		System.out.println(this.id);

	
	}
	public static void main(String[] args) {
		Emp2 e1=new Emp2();
		e1.EmpDetails("Tom", 101);
		
		Emp2 e2=new Emp2();
		e2.EmpDetails("Nitin", 102);
		
		
		
		
	}

}
