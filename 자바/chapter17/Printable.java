package chapter17;
//8-1
//인터페이스(interface)
//추상(미완성) 메소드만 담고 있다
public interface Printable {
	//미완성(추상) 메소드
	//메소드의 몸체를 갖지 않는다
	public void print(String doc);//중괄호가 없는게 메소드의 몸체가 없다는 뜻
	public void colorPrint(String doc);
	
	public static void main(String[] args) {
		//인스턴스 생성 불가
		//Printable printable = new Printable(); 
		//참조변수로는 선언 가능
		Printable printable;
	}
	
	
}
