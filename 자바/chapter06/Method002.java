package chapter06;
//4-9
public class Method002 {

	public static void main(String[] args) {
		//함수 호출시에는 매개변수의 타입과 수를 맞추어야 한다
		hiEveryone(8, 198);
		//hiEveryone(12);(X)
		//hiEveryone("문자열", 198);(X)
		double myHeight = 13.5;
		hiEveryone(12, myHeight);
		byEveyone();
		
	}
	//매개변수가 둘인 메소드의 정의
	public static void hiEveryone(int age, double height) {
		//int age
		System.out.println("제 나이는 "+age+"세 입니다");
		System.out.println("제 키는 "+height+"cm 입니다");
	}
	/*
	 * 매개변수(입력)가 없는 메소드의 정의
	 * void: 반환(출력)이 없는 리턴 타입
	 */
	public static void byEveyone() {
		System.out.println("다음에 뵙겠습니다");
	}
	
}
