package review;

public class AboutClass {
	//18-5
	//로또 생성 프로그램
	//MVC 패턴 model, view, controller
	//로또 5개의 번호 묶음
	//로또 1개의 번호 묶음 - 추상화
	
	public static void print(Object obj) {
		System.out.println(obj);
		//제네릭한 코드: 자료형 타입을 신경안쓰고 데이터를 넣을 수 있다
	}
	//=>발전된게 제네릭
	
	public static void main(String[] args) {
		//모든 데이터 타입을 받아서 콘솔에 출력
		print(1);
		print("문자열");
		print(new LottoDto());
	}

}
