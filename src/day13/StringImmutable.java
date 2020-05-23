package day13;

/*String Immutable : means whenever string object is created , data or state can't be changed but 
 * a new string is created.
 * 
 */
public class StringImmutable {

	public static void main(String[] args) {
		String s=new String("Core");//2 object
		
		String s1=new String("Java");
		s.concat(s1);//
		System.out.println(s);
		//Core
		
		String p1="Delhi";
		String p2="Delhi";
		String p3="Noida";
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("P1 Memory : "+p1.hashCode());//memory allocation
		System.out.println("P2 Memory : "+p2.hashCode());
		System.out.println("P3 Memory : "+p3.hashCode());
		
		
	}

}
