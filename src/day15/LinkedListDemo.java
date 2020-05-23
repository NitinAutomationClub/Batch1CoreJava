package day15;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
/*1. It is a dynamic array
 * 2. It divided into two parts Data and Next(address of next node
 * Means Node 1 is having : Node 1 Data and Node 2 Addreess
 * 
	*/
	public static void main(String[] args) {
		
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("Selenium");//0
		ll.add("Automation");//1
		ll.add("Core");//2
		
		
		System.out.println("Linked List size: "+ll.size());
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		ll.addFirst("Nitin");
		System.out.println("**********After Adding frst**************");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
			
		}
		ll.addLast("Java");
		
		System.out.println("**********After Adding*Lst*************");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
			
		}
		System.out.println("*******For Each Loop**********88");
		//For each loop//Advance loop
		for(String str : ll)
			System.out.println(str);
		//Iterator
		
		System.out.println("*******Iterator************");
		Iterator<String>it=ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("*******While Loop************");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
	}
	
	
	

}
