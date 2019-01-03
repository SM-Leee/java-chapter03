package chapter03;

public class ObjectTest01 {
	
	public static void main(String[] arg) {
		
		Point p = new Point(10, 20);
		System.out.println(p.getClass());	// reflection ( runtime할때 알려준다 ) 
		System.out.println(p.hashCode());	// reference value x ( 레퍼런스 변수에 저장되어 있다)
											// address x
											// address의 기반의 hashing 값을 만들어냄(address 기방의 hashing은 유일하게 하나이다)
		
		System.out.println(p);
		System.out.println(p.toString());	// getClass() + "@" + hashCode()-16진법
	}

}
