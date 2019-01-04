package collection;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("둘리");
		stack.push("또치");
		stack.push("희동이");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		while(stack.isEmpty() == false) {
			String value = stack.pop();
			System.out.println(value);
		}
		//stack.pop();	//비어있는 경우에는 예외발생

	}

}
