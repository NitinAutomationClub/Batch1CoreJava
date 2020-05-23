package day8;

//Super keyword is a reference variable which is refer to immediate parent class object
class test
{
	int i=10;
}
public class SuperDemo1 extends test {

	int i=20;
	void show(int i)
	{
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	public static void main(String[] args) {
		SuperDemo1 obj=new SuperDemo1();
		obj.show(30);
		
	}

}
