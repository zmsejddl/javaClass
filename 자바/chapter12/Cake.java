package chapter12;
//7-9
//Object클래스 - 모든 클래스의 최상위 클래스
//extends Object - 오브젝트 클래스를 상속받는 문장이 생략되어 있다
public class Cake {
	private String name;

	@Override
	public String toString() {
		return "Cake [name=" + name + "]";
	}
	

}
