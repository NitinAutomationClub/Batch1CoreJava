package day5;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ArryaDemo {

	public static void main(String[] args) {
		int sal[]=new int[3];
		sal[0]=100;
		sal[1]=200;
		//sal[2]=300;
		
		System.out.println(sal[2]);

		int len=sal.length;
		System.out.println("Array Length : " +len);
		
		for(int i=0;i<len;i++)
		{
			System.out.println(sal[i]);
			
		}
		String name[]=new String[3];
		name[0]="Core";
		//name[1]="Java";
		name[2]="Selenium";
		System.out.println(name[1]);
	
		String data[][]=new String[3][4];//row-2 ,column-3 0,0 0,1 0,2 1,0 11 12 13 21 22 23
		//Ist Row
		data[0][0]="a";
		data[0][1]="b";
		data[0][2]="c";
		data[0][3]="l";
		
		//IInd Row
				data[1][0]="d";
				data[1][1]="e";
				data[1][2]="f";
				data[1][3]="jjj";
				
				//IIIrd Row
				data[2][0]="g";
				data[2][1]="h";
				data[2][2]="i";
				data[2][3]="hhhh";
				
				System.out.println(data[2][1]);
				int rowLength=data.length;
				System.out.println("Rowlength"+rowLength);
				
				int colLength=data[0].length;
				System.out.println("Columnt Length : "+colLength);
				
				for(int i=0;i<rowLength;i++)
				{
					for(int j=0;j<colLength;j++)
					{
						System.out.println(data[i][j]);
					}
				}
				
				Object data1[]=new Object[5];
				data1[0]=100;
				data1[1]="Java";
				data1[2]=12.5;
				
		
	}

}
