package day4;

import javax.sound.midi.Synthesizer;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a=1;
		int b=++a; //PreIncrement ,first increment than assign value 
		
		System.out.println(a);//1
		System.out.println(b);//1 0r 2
	
		System.out.println("Post Incement");
	int a1=1;
	int b1=a1++;//Post Increment //first assign than increment
	System.out.println(a1);//2
	System.out.println(b1);//1
	
	System.out.println("Pre Decrement");
	
	int a2=1;
	int b2=--a2;
	//PreDecrement , first decrement than assign value
	System.out.println(a2);
	System.out.println(b2);
	
	System.out.println("Post Decrement");
	int a3=1;
	int b3=a3--;
	System.out.println(a3);
	System.out.println(b3); 
	
	
	}

}
