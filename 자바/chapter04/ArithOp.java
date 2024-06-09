package chapter04;
//3일차 1번째
public class ArithOp {

	public static void main(String[] args) {
		/*
		 * 연산자
		 * 대입 연산자와 산술 연산자
		 * =: 연산자의 오른쪽에 있는 값을 연산자 왼쪽에 대입
		 * +: 두 피 연산자의 값을 더한다
		 * -: 빼기
		 * *: 곱하기
		 * /: 나누기
		 * 위에 4개가 사칙연산자
		 * %: 나머지를 반환하는 연산자
		 */
		
		int n1 = 10;
		int n2 = 3;
		int result = n1/n2;
		System.out.println(result);
		int r1 = n1%n2;
		System.out.println(r1);
		
		//연산자의 우선순위
		int r2 = 2-1-3*2;
		System.out.println(r2);
		//*, /가 우선 연산된다
		int r3 = (3+3)*2;
		System.out.println(r3);
		//우선 순위를 위해 소괄호를 사용 가능하다
		
		//복합 대입 연산자
		int num = 1;
		num = num + 5;
		num += 5;//num = num + 5;
		int num1 = 0;
		num1 += 1;
		System.out.println(num1);//1
		System.out.println(num1 += 5);//6
		System.out.println(num1 += 15);//21
		//a = a - b; -> a -= b
		//a = a*b; -> a*=b
		//a /= b
		//a %= b
		
		/*
		 * 관계 연산자
		 * 값은 true or false(참이나 거짓)
		 * <: n1<n2: n1이 n2보다 작은가?
		 */
		int number1 = 0;
		int number2 = 1;
		System.out.println(number1<number2);
		// 0<1: 참(true)
		boolean b1 = number1 < number2;//관계 연산자는 boolean에 담아야 된다
		System.out.println(b1);
		// >: n1 > n2: n1이 n2보다 큰가?
		System.out.println(number1>number2);
		// <=: 같거나 작은가?(또는 or)
		System.out.println(number1<=number2);
		// >=: 크거나 같은가?
		System.out.println(number1>=number2);
		int number3 = 0;
		System.out.println(number1>=number3);
		// ==: 같은가?
		System.out.println(number1==number2);
		// 데이터 타입과 값이 다 같아야 == 값이 true가 나온다 
		String stringTypeNumber = "0";
		//System.out.println(number1==stringTypeNumber); 비교 자체가 안 됨
		// !=: 다른가?
		System.out.println(number1!=number2);
		//정수와 실수를 비교 할 때는 값만 비교한다
		int num2 = 42;
		double d1 = 42.0;
		System.out.println(num2 == d1);
		
		/*
		 *  논리 연산자
		 *  &&: 엠퍼센트: and, a&&b: a와 b 모두 true이면 연산 결과는 true
		 *  연산 결과는 true
		 *  논리 and(&&) - 그리고
		 *  피연산자1 / 피연산자2 / 연산 결과
		 *  true / true / true
		 *  false / true / false
		 *  true / false / false
		 *  false / false / false
		 */
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println((0>1)&&(1>2));
		System.out.println((0>1)&&(1<2));
		System.out.println((0<1)&&(1<2));
		/*
		 * 논리 OR: ||: 또는
		 * a||b: a와 b 둘 중 하나라도 true이면 연산결과는 true
		 * 피연산자1 / 피연산자2 / 연산 결과
		 * true / true / true
		 * true / false / true
		 * false / true / true
		 * false / false / false
		 */
		/*
		 * 논리 NOT: !: 반전
		 * !a: 연산 결과는 a가 true이면 false,
		 * a가 false이면 true로 반전시킴
		 * 피연산자 / 연산 결과
		 * true / false
		 * false / true
		 */
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(0<1));
		boolean b3 = 0<1;
		System.out.println(!b3);
		
		
		
		
		
		
		
		
		
	}

}
