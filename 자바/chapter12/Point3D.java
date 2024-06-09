package chapter12;

//7-12
public class Point3D extends Point {
	private int z;

	public Point3D(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	// 오버라이딩의 조건
	// 메소드의 내용만을 새로 작성하는 것이므로
	// 메소드의 선언부(메소드 이름, 메소드 매개변수, 메소드 반환타입)를 상위 클래스의 것과 완전히 일치해야 한다
	// 1.선언부가 상위 클래스의 메소드와 일치해야 한다
	// 2.접근 제어자를 상위 클래스의 메소드보다 좁은 범위로 변경할 수 없다
	// 3.예외는 상위 클래스의 메소드보다 많이 선언할 수 없다
	public String getLocation() {
		return "x: " + x + ", y:" + getY() + ", z:" + z;
	}

	// 오버라이딩
	public void parentMethod() {

	}

	// 오버로딩
	public void parentMethod(int i) {

	}

	// 이름 중복 에러
	// public void parentMethod() {}

	// @-어노테이션
	// @Override: 밑에 정의하는 메소드는 오버라이딩하는 메소드를 작성한다는 것을 컴파일러에게 알려 주게 되면
	// 오버라이딩 문법이 틀리게 되면 컴파일 에러가 발생 된다
	@Override
	public String what() {
		// 매개변수가 달라서 에러
		// public String what(String s) {
		// 리턴 타입이 달라서 에러
		// public void what() {
		// 이름이 다를 때 컴파일 에러
		// public String whatThe() {
		return "i am point3D";
	}

	// 오버로딩 - 기존에 없는 새로운 메소드를 정의하는 것
	// 오버라이딩 - 상속받은 메서드의 내용을 변경하는 것

}
