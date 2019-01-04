package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		String s1 = new String("고길동");
		String s2 = new String("고길동");
		
		s.add("둘리");
		s.add("마이콜");
		s.add(s1);
		//s.add(s2);
		
		System.out.println(s.contains(s2));	//동질성으로 찾는다. ( 내용으로 찾는다)
		System.out.println(s.size());
		
		String s3 = new String("고길동");
		s.remove(s3);
		
		//순회1
		for(String str : s) {
			System.out.println(str);
		}

	}

}
