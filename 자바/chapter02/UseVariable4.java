package chapter02;
//8번째 둘째날
public class UseVariable4 {

	public static void main(String[] args) {

		//변수
		int number = 1;
		System.out.println(number);
		number = 2;
		System.out.println(number);
		int num;
		int a = 1,b = 2;
		//;세미콜론: 문자의 끝을 의미
		System.out.
		println(a);//(X)
		int c = 1;int d = 3;//(X)
		
		//변수 활용의 예
		int num1;
		num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println(num3);
		
		//다양한 자료형 활용의 예
		//자바 기본 실수 자료형은 double
		double pi = 3.14;
		System.out.println(3.14);
		
		double d1, d2;
		double d3;
		double d4;
		double result;
		d1 = 1.0000001;
		d2 = 2.0000001;
		result = d1 + d2;
		System.out.println(result);//3.0000002
		//실수의 연산은 오차가 발생한다
		//한정된 공간에 실수를 저장하기 위해
		//소수점 자리를 제한하기 위해 
		//공식을 사용해서 소수점 자리를 제한하여 저장하기 때문에
		//자주 사용하는 자료형 boolean, int, double
		//boolean 불린, 불 
		//공간이 1byte
		//두 가지 상황을 체크하기 위해 자주 쓰인다 
		//값: 참(true)과 거짓(false)
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		//문자열 자료형
		String str1 = "문자열 자료형의 표현은 쌍따옴표";
		System.out.println(str1);
		//boolean, int, double, String
		String lectureName = "정보처리기능사 취득 과정";
		System.out.println(lectureName);
		
		//변수(매우 중요!!!!!)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
