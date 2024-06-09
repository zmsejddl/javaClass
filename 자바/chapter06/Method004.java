package chapter06;
//4-11
public class Method004 {

	public static void main(String[] args) {
		/*
		 * 값을 반환하는 메소드
		 * return: 값의 반환을 명령
		 * 리턴타입: 반환되는 값의 데이터 타입
		 * boolean, int, double, String
		 */
		adder();
		System.out.println(adder());
		int n1 = adder();
		System.out.println(n1);
		
		adder2(1, 1);//2
		System.out.println(adder2(1, 1));
		int result = adder2(1, 1);
		System.out.println(result);
	}
	
	public static double adder4(double num) {
		//String str = "문자열";: return에 다른 데이터 타입을 넣으면 안됨
		return num*num;
		//System.out.println("d");: return은 항상 제일 밑에 있어야 된다
	}
	
	public static int adder3(int num1, int num2) {
		return num1+num2;
	}
	
	public static int adder2(int num1, int num2) {
		int addResult = num1+num2;
		return addResult;
		//return 3.14;(x)
		//return "문자열";(x)
	}
	
	public static int adder() {
		return 0;
	}
	
}
