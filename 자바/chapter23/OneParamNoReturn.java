package chapter23;

//11-4
//매개변수가 있고 return 값이 없는 람다식
public class OneParamNoReturn {

	public static void main(String[] args) {
		Printbale p;
		//줄임 없는 표현
		p = (String s)->{
			System.out.println(s);
		};
		p.print("lambda exp one.");
		
		//중괄호 생략 - 메소드 몸체가 하나의 문장이면 중괄호 생략 가능
		p = (String s)->System.out.println(s);
		p.print("lambda exp two.");
		
		//매개변수 형 생략
		p = (s)->System.out.println(s);
		p.print("lambda exp three.");
		
		//매개변수 소괄호 생략 - 매개변수의 수가 하나인 경우에만 생략 가능
		p = s->System.out.println(s);
		p.print("lambda exp four.");
		
		
	}
}
