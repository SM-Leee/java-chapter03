package chapter03;

public class Test {

	public static void main(String[] args) {
		
		Assis a1 = new Assis(10, 20);
		Assis a2 = new Assis(20, 10);
		
		System.out.println(a1.hashCode()+ " : "+a2.hashCode());
		System.out.println(System.identityHashCode(a1)+" : "+System.identityHashCode(a2));
		System.out.println(a1.equals(a2));
		System.out.println(a1==a2);
		System.out.println(a1.toString()+" : "+a2.toString());
		System.out.println("-----------------------------------------------------");
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1.hashCode()+ " : "+s2.hashCode());
		System.out.println(System.identityHashCode(s1)+" : "+System.identityHashCode(s2));
		System.out.println(s2.equals(s1));
		System.out.println(s1==s2);
		System.out.println(s1.toString()+" : "+s2.toString());
		System.out.println("-----------------------------------------------------");
		
		String s3 = "ABC";
		String s4 = "ABC";
		System.out.println(s3.hashCode()+ " : "+s4.hashCode());
		System.out.println(System.identityHashCode(s3)+" : "+System.identityHashCode(s4));
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println(s3.toString()+" : "+s4.toString());
		System.out.println("-----------------------------------------------------");
		
		
		String s5 = null;
		System.out.println(equalString(s5));
		String s6 = "Hello";
		System.out.println(equalString(s6));
		System.out.println("-----------------------------------------------------");


	}
	public static boolean equalString(String s5) {
		return "Hello".equals(s5);
	}

}
