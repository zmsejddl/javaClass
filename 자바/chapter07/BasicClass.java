package chapter07;
//5-13
public class BasicClass {

	public static void main(String[] args) {

		/*
		 * String 클래스
		 * 배열
		 * String 인스턴스 생성 두가지 방법
		 */
		String str1 = "Happy";
		String str2 = "Birthday";
		String str3 = new String("To");
		
		
		
		
		/*
		 * 매개변수로 클래스형 데이터 타입을 참조 변수로 선언하여 
		 * 문자열을 인자로 전달받을 수 있다
		 */
		printString(str1);
		
		String[] strArr = {"가", "나", "다"};
		String[] strArr2 = new String[3];
		
	}

	public static void printString(String str) {
		System.out.println(str);
	}
}
