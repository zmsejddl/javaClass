package chapter17.printable2;

public class LPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("엘지 프린터 출력");
		System.out.println(doc);
	}

}
