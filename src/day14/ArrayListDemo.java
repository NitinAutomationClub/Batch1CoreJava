package day14;

import java.util.ArrayList;

/*Array List
 * 1. It is dynamic in nature means we can increase or decrease the size of arraylist as
 * per the requirement
 * 2.We can insert duplicate value
 * 3.It maintain insertion order , means maintain  index order 
 * 4. Allow random access to fetch any element 
	*/


public class ArrayListDemo {

	
	public static void main(String[] args) {
		//int []a=new int[3];//size fixed static Array
		
		//Non Generic : Means we can store any kind of data value
		ArrayList ar=new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		ar.add(40);//3
		ar.add(50);//4
		ar.add(30);//5
		System.out.println("Size:  "+ar.size());
		ar.add("Test");//6
		ar.add(12.67);//7
		ar.add('c');//8
		ar.add(true);//9
		System.out.println("Size:  "+ar.size());
		System.out.println(ar.get(2));
		System.out.println(ar.get(9));
		
		System.out.println("******************************************");
				for(int i=0;i<ar.size();i++)
				{
					System.out.println(ar.get(i));
				}
				
				
				System.out.println("***********Generic Example************");
				
				ArrayList<Integer> ar1=new ArrayList<Integer>();
				ar1.add(10);
				ar1.add(20);
				//ar1.add("Selenium"); Not possible
				ar1.add(30);
				ar1.add(40);
				ar1.add(50);
				for(int i=0;i<ar1.size();i++)
				{
					System.out.println(ar1.get(i));
				}
				System.out.println("****************************************");
				ArrayList<String> ar2=new ArrayList<String>();
				
				ar2.add("JAM");//0
				ar2.add("Spices");//1
				ar2.add("Wheat");//2
				ar2.add("Floor");//3
				ar2.add("Milk");//4
				System.out.println("Size is "+ ar2.size());
				//System.out.println("Before Delete*************");
				
				/*for(int i=0;i<ar2.size();i++)
				{
					System.out.println(ar2.get(i));
				}
				
				ar2.remove("Java");
				System.out.println("After Delete***************");
				for(int i=0;i<ar2.size();i++)
				{
					System.out.println(ar2.get(i));
				}*/
				
				ArrayList<String> ar3=new ArrayList<String>();
				
				ar3.add("Tea");//0
				ar3.add("Bread");//1
				ar3.add("Cofee");//2
				ar3.add("Butter");//3
				ar3.add("Sugar");//4
				
				ar2.addAll(ar3);
				for (int i=0;i<ar2.size();i++)
				{
					System.out.println(ar2.get(i));
				}
				System.out.println("***********After Delete***************8");
				ar2.removeAll(ar3);
				
				
				for (int i=0;i<ar2.size();i++)
				{
					System.out.println(ar2.get(i));
				}
				
				
				
				
				
				
				
				
		
		
		
		
		
	}

}
