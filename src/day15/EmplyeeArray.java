package day15;

import java.util.ArrayList;
import java.util.Iterator;

public class EmplyeeArray {
/* 1. Create object of Employee class
 * 2. ArrayList of Employee type
 * 3. Add the value
 * 4.Traverse the value//Iterator
 * 
 */
	public static void main(String[] args) {
		//1. Create object of Employee class
		Employee e1=new Employee("Nitin", 30, "QA");
		Employee e2=new Employee("James", 25, "Admin");
		
		//2. ArrayList of Employee type
		ArrayList<Employee> ar=new ArrayList<Employee>();
		
		// 3. Add the value
		ar.add(e1);
		ar.add(e2);
		
		// 4.Traverse the value//Iterator
			
		//Iterator<Employee>it=	ar.iterator();
			
		Iterator<Employee> it =ar.iterator();
		
		while(it.hasNext())
		{
			Employee emp=it.next();
			
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		System.out.println("----------");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
