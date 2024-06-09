package chapter20;

import java.util.Calendar;

//9-11
public class Calendar002 {

	public static void main(String[] args) {

		//특정 날짜 설정하기
		//2019년 4월 29일로 날짜를 설정한다
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		//month의 경우 0부터 시작하기 때문에 4월인 경우, 3으로 지정해야 된다
		//date1.set(2019, 3, 29);
		date1.set(2019, Calendar.APRIL, 29);
		
		String[] DAY_OF_WEEK = {"일", "월","화","수","목","금","토"};
		
		System.out.println("data1은 "+toString(date1)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		//두 날짜간의 차이를 얻으려면, getTimeMillis() 천분의 일초 단위로 변환해야 한다
		long difference = (date2.getTimeInMillis()) - (date1.getTimeInMillis())/1000;
		//1초 = 1000밀리초
		System.out.println("date2 - date1 " + difference + "초가 지났다");
		//1일 = 24*60*60
		System.out.println("일(day)로 계산하면 " + difference/(24*60*60) + "일이다");
		
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH)+1) + "월" + date.get(Calendar.DATE) +"일";
	}

}
