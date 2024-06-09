package chapter17.printable;
//8-3

//인터페이스의 본질적 의미
//코드의 덩어리 + 인터페이스 + 코드의 덩어리: 코드와 코드를 이어주는 역할
//라이브러리 + 인터페이스 + 내가 작성하는 코드

//윈도우에서 프린트 기능을 하는 라이브러리 제공
//프린터 만드는 회사에서는 그 라이브러리를 활용해서
//프린터 소프트웨어를 작성

//윈도우에서 제공하는 인터페이스
public interface Printable {

	public void print(String doc);

}
