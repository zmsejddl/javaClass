package chapter08;
//6-2
//import: 문서에 포함하겠다는 의미
import chapter08.circle.Circle;

public class CircleMain {
	
	public static void main(String[] args) {
		//동일 패키지 내의 클래스 사용
		//동일 패키지 내에서는 import생략 가능
		Square square = new Square();
		square.getSquare();
		
		Circle c1 = new Circle(9);
		chapter08.circle2.Circle c2 = new chapter08.circle2.Circle(4);
		double d1 = c1.getArea();
		System.out.println(d1);
		double d2 = c2.getPerimeter();
		System.out.println(d2);
		//다른 패키지의 클래스를 가져오는 방법
		//1.import하는 방법
		//2.패키지 명을 붙여주는 방법
		
		//패키지
		//원의 넓이를 구하는 클래스
		//배포하게 되면 라이브러리
		//www.wxfx.com의 Circle.java
		//www.fxmx.com의 Circle.java
		//동일 이름의 클래스 파일을 같은 위치에 둘 수 없다
		//패키지를 따로 두게 되면 동일 이름의 클래스가 구별 될 수 있다
		
		//패키지 선언에 따른 문제 해결
		//서로 다른 패키지의 두 클래스는 인스턴스 생성 시 사용하는 이름이 다르다
		
		//패키지 이름 규칙
		//모두 소문자로 구성
		//인터넷 도메인 이름의 역순으로 이름을 구성
		//이름 끝에 클래스를 정의한 주체 또는 팀의 이름 추가
		//예)www.wxfx.com의 com.wxfx.smart
		//www.fxmx.com의 com.fxmx.simple
	}
	
}
