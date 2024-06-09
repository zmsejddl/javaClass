package chapter20;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import chapter17.example.Scanner;

public class Exercise10_2 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String pattern = "yyyy/MM/dd";
		String pattern2 = "입력하신 날짜는 E요일입니다.";
		
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		Date inDate = null;
		
		do {
			System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예: 2017/05/11)");
			try {
				System.out.println(">>");
				inDate = df.parse(scanner.nextLine());
				break;
			}catch(Exception e) {}
		}while(true);
		
		System.out.println(df2.format(inDate));
	}

}
