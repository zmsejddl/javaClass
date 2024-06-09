package chapter11;
//6-14
//파일질라 다운로드 하기 집에서
//메소드 오버로딩
//호출된 메소드를 찾을 때 참조하게 되는 두가지 정보
// - 메소드의 이름
// - 메소드의 매개변수 정보
//메소드의 이름이 같을 때는 컴파일 에러 발생
//두 가지 경우에는 허용한다
//1.매개변수의 수가 다르다
//2.매개변수의 타입이 다른 경우

//메소드 오버로딩(overloading)
//메소드 이름이 같지만 매개변수의 수와 자료형이 다르게 하는 것
public class MyHome {
	
	public int simpleMethod() {
		return 0;
	}
	
	/*
	 * public double simpleMethod() {
	 * 		return 0.0;
	   }
		반환형은 메소드 오버로딩의 조건이 아니다
	 */
		
	public void mySimpleRoom(int n) {
		System.out.println(n);
	}
	
	public void mySimpleRoom(int n1, int n2) {
		System.out.println(n1);
		System.out.println(n2);
	}
	
	public void mySimpleRoom(double n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		MyHome myHome = new MyHome();
		myHome.mySimpleRoom(9);
		myHome.mySimpleRoom(9, 6);
		myHome.mySimpleRoom(4.8);
		
		//System.out.println();이것도 메소드 오버로딩에 속한다
	}
	
}
