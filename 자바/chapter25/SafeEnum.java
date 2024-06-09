package chapter25;
//11-18
public class SafeEnum {

	enum Animal{
		DOG, CAT
	}
	
	enum Person{
		MAN, WOMAN
	}
	
	public static void who(Person man) {
		switch(man) {
		case MAN:
			System.out.println("남성 손님입니다");
			break;
		case WOMAN:
			System.out.println("여성 손님입니다");
			break;
		}
	}
	
	public static void main(String[] args) {
		
		who(Person.MAN);
		//비정상적 메소드 호출의 실수를 줄여 준다
		//컴파일 과정에서 자료형 불일치로 인한 오류 발생
		//who(Animal.CAT);
		
	}

}
