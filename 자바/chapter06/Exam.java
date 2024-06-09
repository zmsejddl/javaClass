package chapter06;
//4-14
public class Exam {

	public static void main(String[] args) {
		/*
		 * 두 수를 입력 받아 더한 값을 리턴 해주는 함수 만들기
두 수를 입력 받아 뺀 값을 리턴 해주는 함수 만들기
두 수를 입력 받아 곱한 값을 리턴 해주는 함수 만들기
두 수를 입력 받아 나눈 값을 리턴 해주는 함수 만들기
두 수를 입력 받아 나머지 값을 리턴 해주는 함수 만들기
직사각형의 두변을 입력 받아 둘레는 리턴 해주는 함수
직사각형의 두변을 입력 받아 넓이를 리턴 해주는 함수
삼각형의 밑변과 높이를 입력 받아 넓이를 리턴 해주는 함수
원의 반지름을 입력 받아 넓이는 리턴 해주는 함수
정사각형의 한변을 입력 받아 넓이는 리턴 해주는 함수
		 */
		System.out.println(cal1(4,9));
		System.out.println(cal2(5,9));
		System.out.println(cal3(6,9));
		System.out.println(cal4(8,9));
		System.out.println(cal5(3,9));
		System.out.println(cal6(8,9));
		System.out.println(cal7(3,9));
		System.out.println(cal8(5,9));
		System.out.println(cal9(9));
		System.out.println(cal10(7));
	}
	public static int cal1(int num1, int num2) {
		return num1+num2;
	}
	public static int cal2(int num1, int num2) {
		return num1-num2;
	}
	public static int cal3(int num1, int num2) {
		return num1*num2;
	}
	public static int cal4(int num1, int num2) {
		return num1/num2;
	}
	public static int cal5(int num1, int num2) {
		return num1%num2;
	}
	public static int cal6(int num1, int num2) {
		return 2*(num1+num2);
	}
	public static int cal7(int num1, int num2) {
		return num1*num2;
	}
	public static int cal8(int num1, int num2) {
		return (num1*num2)/2;
	}
	public static double cal9(double num1) {
		return num1*num1*3.14;
	}
	public static int cal10(int num1) {
		return num1*num1;
	}
}
