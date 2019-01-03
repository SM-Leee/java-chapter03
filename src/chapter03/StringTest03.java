package chapter03;

public class StringTest03 {

	public static void main(String[] args) {
		
		String s = "aBcAbCabcABC";
		
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abc",3));	//3번쨰부터 찾는다
		System.out.println(s.substring(3));	//3번째부터 출력하여라
		System.out.println(s.substring(3,5));	//3~4까지 출력하여라
		
		String s2 = "       ab cd      ";
		String s3 = "efg,hij,lmno,pq";
		
		String s4 = s2.concat(s3);
		System.out.println(s4);
		System.out.println("-----"+s4.trim()+"-----");//앞뒤에 공백을 제거해준다.
		System.out.println("----"+s4.replaceAll(" ", "")+"----");//공백을 다 제거하기 공백을 뒤에꺼로 바꾸기
		
		String[] tokens = s3.split(",");	//특수한 문자를 기준으로 짤라준다
		for(String str : tokens) {
			System.out.println(str);
		}
		
		//StringBuffer
		StringBuffer sb = new StringBuffer("");
		sb.append("Hello");
		sb.append("World");
		sb.append(2018);
		
		
		//String str1 = "Hello "+"World "+2018;
		//String str2 = new StringBuffer("Hello ").append("World ").append(2018).toString();
		//str1을 생성하면 str2처럼 해석해서 만들어준다. 그리고 str1에서 +가 많아지면 가독성이 떨어진다. 그리고 memory가 많이 쓰여진다.
		
		//주의 : + 연산자로 문자열을 더할때
		String str2 = "";
		StringBuffer sb2 = new StringBuffer("");
		for(int i=0;i<100000;i++) {
			//str2 = str2 +i;
			//String str2 = new StringBuffer(str2).append(i);
			sb2.append(i);
		}
		
		//format
		String name = "둘리";
		int score = 100;
		
		System.out.println("둘리님의 점수는 100점입니다.");
		System.out.println(name+"님의 점수는 "+score+"점입니다.");
		String str3 = String.format("%s님의 점수는 %d점입니다.",name,score);
		System.out.println(str3);
		
		
		
		
	}

}
