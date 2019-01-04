package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); 
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		
		//순회1
		int count = list.size();
		for(int i=0;i<count;i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		list.remove(1);
		
		//순회2 : iterator는 한번 쓰면 다시 쓰지 못한다.
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}
		
		//순회3(for~each)
		
		for(String s : list) {
			System.out.println(s);
		}
		
		
		
	}

}
