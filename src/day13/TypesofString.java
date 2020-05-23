package day13;
/*Types of String
 * 1. String
 *2. StringBuffer
 *3.StringBuilder
 * 
 */
public class TypesofString {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Core");
		StringBuffer sb1=new StringBuffer("Java");
		sb.append(sb1);
		System.out.println(sb);
		
		StringBuilder sb2=new StringBuilder("Core");
		StringBuilder sb3=new StringBuilder("Java");
		sb2.append(sb3);
		System.out.println(sb2);
	}

}
