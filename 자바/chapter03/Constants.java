package chapter03;
//10번째
public class Constants {

	public static void main(String[] args) {
		/*
		 * 상수(constants)
		 * - 변수에 값을 딱 한 번만 할당할 수 있다
		 * - 한 번 할당된 값은 변경이 불가능하다
		 * - 키워드 final 선언이 붙어 있는 변수
		 * 상수의 이름
		 * - 모두 대문자로 짓는 것이 관례
		 * - 단어의 연결은 언더바(_)
		 */
		int number = 100;
		number = 10;
		final int MAX_SIZE = 100;
		//MAX_SIZE = 10; 다시 대입 안됨
		final String STR = "문자열";
		final int CONST_ASSIGNED;
		//System.out.println(CONST_ASSIGNED); 이거 안됨
		CONST_ASSIGNED = 12;
		//CONST_ASSIGNED = 89;다시 대입 안됨
		//1.상수는 애플리케이션을 작성할 때 변하면 안되는 데이터는 
		//상수로 설정해 놓으면 실수를 줄일수 있다
		//2.상수는 변수보다 메모리 효율이 좋다
		//원을 다루는 코드
		final double PI_ORIGIN = 3.14;
		
		/*
		 * 리터럴(Literals)에 대한 이해
		 * -자료형을 기반으로 표현이 되는 상수를 의미한다
		 */
		int num1 = 5 + 7;//리터럴 5, 7
		//-정수는 무조건 int형으로 인식하기로 약속되어 있음
		double num2 = 3.3 + 4.5;//리터럴 3.3, 4.5
		String str = "i love java";//리터럴 i love java
		//자바에서 리터럴 정수는 int형이기 때문에
		//int형이 표현할 수 있는 -21~21억 범위를
		//벗어났기 때문에 컴파일 에러가 발생
		//System.out.println(2200000000);
		//long형 상수(리터럴)의 표현 방법
		//l 또는 L을 붙여서 long형 리터럴로 표현
		System.out.println(2200000000L);
		//정수형 상수의 언더바 삽입
		//int money = 1,000,000;
		int money = 1_000_000;
		System.out.println(money);
		//실수형 리터럴
		//double형임을 명시하기 위해 d또는 D삽입
		System.out.println(3.0004999D);
		//float형으로 표현하려면 f또는 F삽입
		System.out.println(2.0004999F);
		//실수형 리터럴은 e표기법도 가능
		System.out.println(3.4e3);
		//부울형 리터럴
		System.out.println(true);
		System.out.println(false);
		//문자형 리터럴 char
		System.out.println('한');
		//문자열 리터럴 String
		System.out.println("한글");
		
		//이스케이프 시퀀스(escape sequences)
		//화명상의 어떠한 상황 또는 상태를 표현하기 위해 약속된 문자
		// /-슬래시, \-백슬래시
		// \n - 개행문자
		System.out.println("Hello world!\nI love java.");
		System.out.print("마지막에 개 행 문자가 없을 뿐");
		System.out.println();
		//인용문을 쓰고 싶을 때 \"
		//"를 문자 그대로 쌍따옴표 문자로 인식 \"
		//이스케이프 시퀀스 \": 큰따옴표 문자
		//"-문자열의 리터럴 시작과 끝
		System.out.println("제임스 고슬링은 늘 말한다");
		System.out.println("\"새로운 일에 도전하는 것을 두려워하지 말고, 실패에 상관없이 계속 도전해야 한다\"");
		System.out.println("\'새로운 일에 도전하는 것을 두려워하지 말고, 실패에 상관없이 계속 도전해야 한다\'");
		//\t: 탭 문자
		System.out.println("1+1\t=2");
		// \ 백슬러시를 단순 문자로 사용: \\
		System.out.println("백슬러시(\\)는 키보드 엔터 위에 있다");
		
		
		
		
		
		
		
		
	}

}
