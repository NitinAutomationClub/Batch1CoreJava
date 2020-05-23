package day13;
/*
 * == operator always check the memory address
 * equal method check the contents
 */
public class StringEqual {

	public static void main(String[] args) {
		String s=new String("Nitin");
		String s1=new String("Nitin");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}

}
