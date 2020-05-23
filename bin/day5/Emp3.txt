package day5;

public class Emp3 {
/*
 * 1.User defined Constructor without parameter
 * 2. User defined Constructor with Parameter
 * 3. Default Constructor 
 */
	
	
	String name;
	int id;
	
	public  Emp3(String name, int id)
	{
		this.name=name;
		this.id=id;
		System.out.println(this.name);
		System.out.println(this.id);

	
	}
	public static void main(String[] args) {
		Emp3 e1=new Emp3("Tom",101);
		Emp3 e2=new Emp3("Nitin",102);
		Emp3 e3=new Emp3("James",103);
		
		
		
		
	}

}
