package chapter23;
//11-7
//매개변수가 있고 반환하는 람다식
public interface CalculateWithReturn {

	int cal(int a, int b);
	
	public static void main(String[] args) {
		CalculateWithReturn c;
		//return 키워드나 메소드 몸체가 문장 둘이상일 경우 중골호 생략이 불가ㅏ
		c = (a, b) -> {return a+b;};
		System.out.println(c.cal(2, 3));
		c= (a, b) -> {
			int sum = a+b;
			return sum;
		};
		System.out.println(c.cal(4, 2));
		//return문 밖에 없으면 return키워드와 중괄호 생략 가능
		c = (a, b) -> a+b;//return a+b; -> a+b;
		System.out.println(c.cal(8, 9));
		
		
	}
	
}
