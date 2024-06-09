package chapter17.example;

public class Scanner {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		//1번
		System.out.print("첫번째 수: ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수: ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
	
		//2번
		String name = scanner.nextLine();
		String code = scanner.nextLine();
		String number = scanner.nextLine();
		System.out.println("이름: " + name);	
		System.out.println("주민번호 앞자리: "+code);
		System.out.println("휴대폰 번호: "+number);
	}

}
