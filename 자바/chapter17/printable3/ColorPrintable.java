package chapter17.printable3;
//8-9
//인터페이스의 상속
//인터페이스간 상속도 extends로 표현
public interface ColorPrintable extends Printable {
	public void printCMYK(String doc);
	//기존 클래스를 수정할 필요가 없어졌다
}
