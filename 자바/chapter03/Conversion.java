package chapter03;
//11번째
public class Conversion {

	public static void main(String[] args) {
		//형 변환
		int interger = 42;
		//interger = "42"; 
		//자바에서는 자료형에 맞는 자료만 대입 할 수 있다
		//int n1 = "string";(X)
		//int n2 = 3.14;(X)
		double d1 = 3.14;
		String s1 = "s";
		//String s2 = 's';(X)
		
		//명시적 형 변환
		double pi = 3.1415;
		int wholeNumber = (int)pi;
		System.out.println(wholeNumber);//정수 부분만 표시됨
		
		//더 작은 크기로 형 변환 할 때는 원본 데이터가 훼손됨을 주의해야 한다
		long num1 = 3000000007L;
		int num2 = (int)num1;
		System.out.println(num2);
		
		long num3 = 42;
		int num4 = (int)num3;
		System.out.println(num4);
		
		//기본 자료형 이외의 자료형은 메소드를 사용하여 형변환 한다
		String s2 = "42";
		int n2 = Integer.valueOf(s2);
		System.out.println(n2);
		
		/*
		 * 자동 형 변환
		 * 1.자료형의 크기가 큰 방향으로 형 변환이 일어난다
		 * 2.자료형의 크기에 상관없이 정수 자료형보다 실수 자료형이 우선한다
		 */
		int number1 = 50;
		long number2 = 2134567890L;
		System.out.println(number1+number2);
		//자료형이 일치해야 연산이 진행되므로
		//number1에 저장된 값이 long형으로 자동 형 변환되어 연산된다
		double dd1 = 30;
		System.out.println(dd1);
		System.out.println(59L+34.5f);
		
		
		
		
		
		
		
		
		
		
	}

}
