package chapter05;
//4-7
public class Exam03 {

	public static void main(String[] args) {

		/*
		 * while문과 Math.random()을 사용해 2개의 주사위를 던졌을 때
		 * 나오는 눈을 (눈1, 눈2)형태로 출력하고 눈의 합이 5가 아니면 계속 
		 * 주사위를 던지고 눈의 합이 5이면 실행을 멈추는 코드를 작성해보라
		 */
		int num1=0;
		int num2=0;
		int num3 = 0;
		while(true) {
			num1=(int)(6*Math.random()+1);
			num2=(int)(6*Math.random()+1);
			num3++;
			System.out.println("("+num1+", "+num2+")");
			if((num1+num2)==5) {
				break;
			}
		}
		System.out.println(num3+"회");
	}

}
