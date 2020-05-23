package day12;

public class Stringreverse {

	public static void main(String[] args) {
		String s="Selenium";
		System.out.println("Sring is : "+ s);
		//muineleS
		int len=s.length();
		System.out.println("Length is :"+len);
		String rev="";
		//length=8 but position start with 0
		//S-0 ,e-1 ,l-2,e-3,n-4,i-5,u-6,m-7
		//len-1======>>8-1=7
		

		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			//rev=m
			//rev=rev+s.charAt(i);
			/*rev=muineleS
			 * 
			 */
		
			
		}

			System.out.println("Reverse String is :"+rev);
			
			String s1=new String("Core");
			String s2=new String("Core");
			System.out.println("S2 hashcode"+s2.hashCode());
			System.out.println(s1.equals(s2));
			System.out.println(s1==s2);
			
			String s3="Core";
			System.out.println(s1.equals(s3));
			System.out.println(s1==s3);
			System.out.println("S1 hashcode"+s1.hashCode());
			
			System.out.println("S3 hashcode"+s3.hashCode());
	}

}
