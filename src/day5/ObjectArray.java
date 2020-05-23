package day5;

public class ObjectArray {
//Object array used to store differnt data type value in a variable
	
	public static void main(String[] args) {
	
		
		Object ob[]=new Object[4];
		ob[0]=10;
		ob[1]="Java";
		ob[2]=12.34;
		ob[3]='c';
		int len=ob.length;
		System.out.println(len);
		for (int i=0;i<ob.length;i++)
		{
			System.out.println(ob[i]);
		}
		

	}

}
