package chapter07;
//5-16
public class DefaultCons {
	int balance;
	
	//생성자 메소드를 특별히 정의하지 않으면
	//디폴트 생성자가 생긴다
	public DefaultCons() {
	//기본(디폴트) 생성자의 형태	
		System.out.println("DefaultCons 인스턴스 생성");
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public static void main(String[] args) {
		//모든 클래스의 인스턴스 생성은 생성자 호출을 동반한다
		DefaultCons defaultCons = new DefaultCons();
		//인스턴스 변수의 초기화에 이용 - 생성자 메소드
	}

}
