package chapter17.scanner;

import java.util.Scanner;

//8-18
public class ScannerTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("문자열 입력: ");
		//nextLine(): 문자열 입력받는 메소드
		//String str1 = sc.nextLine();
		//System.out.println("입력된 문자열: " + str1);
		//다양한 자료형을 입력 받을 수 있는 메소드
		//byte nextByte()
		//double nextDouble()
		//boolean nextBoolean()
		//버그 - 숫자형을 입력 받을 때 엔터 처리가 잘 안됨
		System.out.print("정수 입력: ");
		//숫자를 입력 받을 때 예) 3 + Enter
		//입력한 문자는 3+\n
		int num1 = sc.nextInt();
		//정수만 입력 받은 경우에는 \n을 처리할 수 있는 nextLine()을 써주면 된다
		sc.nextLine();
		System.out.println("입력된 정수: " + num1);
		System.out.print("문자열 입력: ");
		//처리가 안된 \n이 nextLine()에 입력 됨
		String str2 = sc.nextLine();
		System.out.println("입력된 문자열: " + str2);
	}

}
