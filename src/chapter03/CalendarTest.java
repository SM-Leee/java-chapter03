package chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		//내가 직접 생성하지않고, 메소드를 통해서 생성하는 것!
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		//2020년 12월 25일
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		//1994년 02월 28일
		cal.set(1994, 1, 28);
		printDate(cal);
		
		cal.add(Calendar.DATE, 1000);	//1000일은 더해준다.
		printDate(cal);
	}

	public static void printDate(Calendar c) {
		String [] days = {"일","월","화","수","목","금","토"};
		//년도
		int year = c.get(Calendar.YEAR);
		//월(0~11)
		int month = c.get(Calendar.MONTH);
		//일
		int date = c.get(Calendar.DATE);
		//요일 : 1(일요일) - 7(토요일)
		int day = c.get(Calendar.DAY_OF_WEEK);
		//시
		int hour = c.get(Calendar.HOUR);
		//분
		int minute = c.get(Calendar.MINUTE);
		//초
		int second = c.get(Calendar.SECOND);
		
		System.out.println(
				year+"년 "+
				(month+1)+"월 "+
				date+"일 "+
				days[day-1]+"요일 "+
				hour+"시 "+
				minute+"분 "+
				second+"초 ");
	}
}
