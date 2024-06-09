package chapter17.printable2;

public class PrintMain {

	public static void main(String[] args) {
		String myDoc = "this is a report about...";
		
		
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		
		prn = new LPrinterDriver();
		prn.print(myDoc);
		
		
		
		
	}

}
