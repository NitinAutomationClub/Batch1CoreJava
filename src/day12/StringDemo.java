package day12;

/*String
 * 1. Non Primitive Data Type( Size is not fixed)
 * 2. String is a Class and it contains so many methods
 * 3. String is Final class so we can't inherit
 * 4. String is nothing but a sequence of character array
 * 
 */



public class StringDemo {

	public static void main(String[] args) {
		
		char[] c={'C','O','R','E'};
				String s=new String(c);
				System.out.println(s);
				
				String s1="a";//97
				String s2="A";//65
				System.out.println(s1.compareTo(s2));
				
				String s3="Core";
				String s4="COrE";
				
				System.out.println(s3.equals(s4));
				
				System.out.println(s3.equalsIgnoreCase(s4));
				
				String s5="selenium";
				System.out.println(s5.toUpperCase());
				String s6="SELENIUM";
				System.out.println(s6.toLowerCase());
				
				String s7="this is demo";
				System.out.println(s7);
				
				System.out.println(s7.replace("is", "was"));
				
				System.out.println(s7.replaceFirst("is", "was"));
				String s8="Core Java";//c=0 , o=1 ,r=2,e=3 space=4 , j=5 ,a=6,v=7,a=8
				String s9="Nitin";
				
				System.out.println("Concat"+s8.concat(s9));
				System.out.println("+Operator"+s8+s9);
				System.out.println(s8.length());
				System.out.println(s8.substring(2));
				System.out.println(s8.substring(2,9));
				System.out.println(s9.indexOf('i'));
				System.out.println(s9.lastIndexOf('i'));
				System.out.println(s9.charAt(2));
			
				System.out.println(s9.contains("Ni"));
				
				char cc[]=s9.toCharArray();
				for(int i=0;i<cc.length;i++)
				{
					System.out.println(cc[i]);
				}
						
				
				}
			
				
	
	}

	


