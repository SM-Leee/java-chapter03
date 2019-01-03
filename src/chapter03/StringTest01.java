package chapter03;

public class StringTest01 {

	public static void main(String[] args) {
		//C:\\temp
		// /temp(unix) <-> d:\temp(window)
		String s = "c:\\temp";
		
		//"Hello"
		String s1 = "\"Hello\"";
		
		System.out.println(s);
		System.out.println(s1);
		
		// \t -> tab
		// \n -> new line
		// \r -> carriage return
		
		System.out.print("Hello\tWorld\n");
		System.out.print("Hello\tWorld");
		
		// ''
		char c = '\'';
		System.out.println(c);
			
	}

}
