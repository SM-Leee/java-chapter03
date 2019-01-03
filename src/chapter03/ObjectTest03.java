package chapter03;

public class ObjectTest03 {

	public static void main(String[] args) {
		
		Rect r1 = new Rect(10, 20);
		System.out.println(r1);
		
		Rect r2 = new Rect(20, 10);
		
		System.out.println(r2.equals(r1));
		System.out.println(r1.hashCode()+" : "+r2.hashCode());
		System.out.println(System.identityHashCode(r1)+" : "+System.identityHashCode(r2));

		Rect r3 = new Rect(50, 5);
		System.out.println(r3.equals(r2));
		
		// String equals 비교 / 좋은코드
		String s = null;
		System.out.println(equalHello(s));
		
	}
	
	public static boolean equalHello(String s) {
		
		return "Hello".equals(s);
	}

}
