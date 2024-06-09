package chapter19;
//9-2
//Object 클래스의 메소드 - toString()
//인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의한 것이다
//인스턴스 변수에 저장된 값들을 문자열로 표현한다는 뜻이다
//Object 클래스에 정의된 toString()은 호출하면 
//클래스 이름과 16진수 해수코드로 된 인스턴스의 메모리 주소를 리턴한다
public class ObjectToString {

	public static void main(String[] args) {
		
		Card c1 = new Card();
		System.out.println(c1);
		System.out.println(c1.toString());
		//참조변수 이름으로 콘솔에 출력하면 .toString()이 생략된 것 처럼 호출된다

		Card2 c2 = new Card2();
		System.out.println(c2);
	}

}
