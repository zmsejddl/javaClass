package chapter17.printable2;

public class SPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("삼성 프린터 출력");
		System.out.println(doc);
	}

	

}
