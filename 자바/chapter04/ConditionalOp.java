package chapter04;
//3일차 5번째
public class ConditionalOp {

	public static void main(String[] args) {

		/*
		 * 삼항 연산자
		 * 조건식(피연산자1)?값 또는 연산식(피연산자2):값 또는 연산식(피연산자3)
		 * 조건식에 따라 콜론(:) 앞뒤의 피연산자가 선택된다
		 * 조건식 true -> 피연산자2 선택(반환)
		 * 조건식 false -> 피연산자3 선택
		 */
		int score = 85;
		String grade = (score > 90) ? "A" : "B";
		System.out.println(score + "점은 " + grade + "등급입니다");
		
		/*
		 * num1은 음수인가 양수인가?
		 */
		int num1 = -1;
		String result = (num1 > 0) ? "양수" : "음수";
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
