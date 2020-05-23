package day5;

public class Array {
	
	/*Array to store similar data type value in a variable
	 * Static Array ....size fixed .....Array list which comes under Collection concept
	 * 
	 */
	

	public static void main(String[] args) {
	
	int sal[]=new int[8];//size fix
		
		sal[0]=10;
		sal[1]=30;
		sal[2]=40;
		sal[3]=50;
		//sal[4]=60;
		sal[5]=70;
		sal[6]=80;
		sal[7]=90;
		
	String s[]=new String [4];
	s[0]="Learning";
	s[1]="Core";
//	s[2]="Java";
	s[3]="Nitin";
	
	
	System.out.println(s[2]);
	System.out.println(sal[4]);
	//System.out.println(sal[8]);
	
	/*for (int j=0;j<s.length;j++)
	{
		System.out.println(s[j]);
	}
	
	*/	
	/*	System.out.println(sal[0]);//10
		System.out.println(sal[1]);//20
		System.out.println(sal[2]);//30
		System.out.println(sal[3]);//40
*/		
		System.out.println("***********************");
		
		System.out.println("Length is "+sal.length);
		
		int len=sal.length;
		
		for(int i=0;i<len;i++)
		{
			System.out.println(sal[i]);//sal[0],sal[1], sal[2],sal[3]
			
		}
		
		
	}

}
