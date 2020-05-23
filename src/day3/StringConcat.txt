package day3;

public class StringConcat {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	String x="Core";
	String y="Java";
	
	System.out.println(a+b);//30
	System.out.println(x+y);//CoreJava
	System.out.println(a+b+x);//30Core
	System.out.println(a+b+x+y);//30CoreJava
	System.out.println(x+y+a);//CoreJava10
	System.out.println(x+y+a+b);//CoreJava30
	System.out.println(x+y+(a+b));//CoreJava30 
	

	}

}
