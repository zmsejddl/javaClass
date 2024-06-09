package chapter20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0,1);
		
		for(int i = 0; i < 12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			int secondSunday = (int) ((weekday ==1) ? 8 : 16 == weekday);
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy=mm=dd은 f번째 e요일입니다").format(d));
			
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		
	}
	
}
