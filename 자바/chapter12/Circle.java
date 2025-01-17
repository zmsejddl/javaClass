package chapter12;
//7-6

//클래스를 재사용하는 방법
//1.상속
//2.포함 관계
//한 클래스를 작성하는 데 다른 클래스를 멤버변수로 선언하여 포함시키는 것도 많이 사용하는 방법이다
//하나의 거대한 클래스를 작성하는 것보다 단위별로 여러 개의 클래스를 작성한 다음 
//단위 클래스들을 포함 관계로 재사용하면 보다 간결하고 손 쉽게 클래스를 작성할 수 있다

//클래스 간의 관계 결정하기
//상속 관계 ~ is a
//원은 점이다 - Circle is a Point
//포함 관계 ~ has a
//원은 점을 가지고 있다 - Circle has a Point
//스마트 티비는 티비이다 - 상속
//티비는 스마트 티비이다(X)
//스포츠카는 자동차이다 - 상속
//덱은 카드를 가지고 있다 - 포함 관계
public class Circle {

	private Point p = new Point();// 포함 관계
	private int r;

}
