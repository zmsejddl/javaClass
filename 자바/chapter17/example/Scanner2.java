package chapter17.example;

public class Scanner2 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		boolean run = true;
		int balance = scanner.nextInt();
		
		while(run) {
			System.out.println("--------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------");
			int options = scanner.nextInt();
			System.out.print("선택> " + options);
			scanner.close();
			if(scanner.nextInt()==1) {
				System.out.print("예금액> " + balance);
			}else if(options == 2) {
				int enter = scanner.nextInt();
				System.out.println("출금액> " + enter);
				balance -= enter;
			}else if(options == 3) {
				System.out.println("잔고> " + balance);
			}else if(options == 4) {
				System.out.println("프로그램 종료");
				return;
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
