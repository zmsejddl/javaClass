package chapter17.scanner;

import java.util.Scanner;

//8-16
//콘솔 입력
public class ScannerTest {

	public static void main(String[] args) {
		//Scanner 클래스 - 라이브러리
		String source = "1 3 5";
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(source);
		//자동 import 단축키 - ctrl + shift + o
		//int형 데이터 추출
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
