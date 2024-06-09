package chapter20;

import java.util.Calendar;

//9-10
public class Calendar001 {
	
	public static void main(String[] args) {
		//기본적으로 현재날짜와 시간으로 설정된다
		Calendar today = Calendar.getInstance();
		System.out.println("이 해의 년도: " + today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0: 1월: " + today.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째주: " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇째 주: " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));
		//DATE와 DAY_OF_MONTH는 같다
		System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일: "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7), 1: 일요일 " + today.get(Calendar.DAY_OF_WEEK));
		//1.일요일 2.월요일.....7.토요일
		System.out.println("오전_오후(0:오전, 1:오후" + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11):"+today.get(Calendar.HOUR));
		System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
		System.out.println(("초(0~59): "+ today.get(Calendar.SECOND)));
		System.out.println("이 달의 마지막 날: " + today.get(Calendar.DATE));
		
	}
	
}
