package chapter04;
//3-14
public class Report {

	public static void main(String[] args) {

		
		
		//1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성(for문 사용)
				int totalSum3 = 0;
				for(int i =0;i<=7674;i++) {
					if(i%3==0) {
						totalSum3 += i; 
					}
				}
				System.out.println(totalSum3);
	}

}
