package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		Date now = new Date();	//현재 시간을 return 하는 함수
		System.out.println(now);
		
		printDate1(now);
		printDate2(now);

	}
	
	public static void printDate1(Date d) {
		//Date의 형식을 자유롭게 이렇게 바꿀수 있다.
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분 ss초");
		
		String s = sdf.format(d);
		System.out.println(s);
	}
	
	public static void printDate2(Date d) {
		//년도 (+1900) 두자리수
		int year = d.getYear();
		//월 (0-11, +1)
		int month = d.getMonth();
		//일
		int date = d.getDate();
		//시
		int hours = d.getHours();
		//분
		int minutes = d.getMinutes();
		//초
		int seconds = d.getSeconds();
		
		System.out.println(
				(year+1900)+"년 "+
				(month+1)+"월 "+
				date+"일 "+
				hours+"시 "+
				minutes+"분 "+
				seconds+"초 ");
		
	}

}
