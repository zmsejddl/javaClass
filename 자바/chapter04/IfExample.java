package chapter04;
//3일차 6번째
public class IfExample {

	public static void main(String[] args) {

		/*
		 * 조건문: if문
		 * if(조건식){
		 *  실행문A
		 * }
		 * 실행문B
		 * 1.조건식이 true이면 실행문A가 실행됨
		 * 2.조건식이 false이면 실행문A가 실행되지 않고 실행문B가 실행됨
		 */
		boolean b = false;
		if(b) {
			System.out.println("if ()안의 결과가 true인 경우에만 실행");
		}
		System.out.println("코드의 끝줄 실행");
		//조건식이 true가 될 때 실행해야 할 문장이 하나밖에 없다면 {}를 생략할 수 있다
		if(false) 
			System.out.println("if 블록안에 포함되는 문장");
		System.out.println("블록 밖의 문장");
		
		if(true) System.out.println("블록안의 문장");
		
		if(true) {
			System.out.println("블록안의 문자1");
			System.out.println("블록안의 문자2");
		}
		
		int score = 93;
		
		if (score > 90) {
			System.out.println("점수가 90보다 크다");
			System.out.println("등급은 A이다");
		}
		if (score < 90) {
			System.out.println("점수가 90보다 작다");
			System.out.println("등급은 B이다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
