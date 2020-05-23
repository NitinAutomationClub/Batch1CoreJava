package day12;

public class StringFirstUpper {

	public static void main(String[] args) {
		String s="this is core java";
		
		//This Is Core Java
		System.out.println(s.length());
		char y[]=s.toCharArray();
		
		//a=97 ,A=65 97-65=32   A+32=a , 
		//a-32=A B=66 ,b=98 98-66=32
		//65-32=43;
		//a-32=A
		
		y[0]=(char)(y[0]-32);  //T
		System.out.println(y[0]);
		
		for(int i=1;i<y.length;i++)
		{
			//this is core java
			if(y[i]==' ')
			{
				y[i+1]=(char) ((y[i+1])-32);
			}
		}
		System.out.println(s);
		
		System.out.println(y);
	}

}
