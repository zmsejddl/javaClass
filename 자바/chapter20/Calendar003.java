package chapter20;

import java.util.Calendar;

//9-12
public class Calendar003 {

	public static void main(String[] args) {

		Calendar date = Calendar.getInstance();
		System.out.println("100일 후");
		date.add(Calendar.DATE, 100);
		System.out.println(toString(date));
		System.out.println("100일 전");
		date.add(Calendar.DATE, -100);
		System.out.println(toString(date));
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH)+1) + "월" + date.get(Calendar.DATE) +"일";
	}
}
