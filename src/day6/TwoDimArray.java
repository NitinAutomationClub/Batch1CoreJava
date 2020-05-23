package day6;

public class TwoDimArray {

	public static void main(String[] args) {
		
	//Declaration
	
		String x[][]=new String[3][5];
		
		System.out.println(x.length);//it return total no. now of row
		System.out.println(x[0].length);// it return total no. of column
		
		//Initialize
		//First Row
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		//Secomd Row
		
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
		
		//Third Row
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		x[2][4]="E2";
		
		
		System.out.println(x[2][3]);//D2
		System.out.println(x[0][4]);//E
		
		System.out.println("******************************");
		
		//Traversing
		
		for(int row=0;row<x.length;row++)//x.length=3 row=0,1,2,3
		{
			for(int col=0;col<x[0].length;col++) // Inner Loop mean , loop within loop//x[0].length=5
			{
				//col=5
				System.out.println(x[row][col]);//0,1,2 ,3,4,5
			}
		}
		
		
		
		
		
		
		
		
	}

}
