package chapter04;
//3일차 2번째
public class LogicalOp {

	public static void main(String[] args) {

		/*
		 *  변수 num1에 저장된 값이 1과 100사이의 수인가?
		 */
		int num1 = 0;
		boolean result;
		result = (num1>1)&&(num1<100);
		System.out.println("1초과 100미만인가? " + result);
		
		//변수 num2에 저장된 값이 2 또는 3의 배수인가?
		int num2 = 9;
		System.out.println("2나 3의 배수인가? "+ ((num2%2==0)||(num2%3==0)));
		
		//변수 num1이 0인가?
		result = !(num1!=0);
		System.out.println("0인가? " + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
