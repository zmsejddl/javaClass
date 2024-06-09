package chapter17.io;

//8-15
public class MultiPrinter extends SimplePrinter {

	@Override
	public void printLine(String str) {
		System.out.println("start of multi...");
		System.out.println(str);
	}

	public static void main(String[] args) {
		Printable prn1 = new SimplePrinter();
		Printable prn2 = new MultiPrinter();

		if (prn1 instanceof Printable) {
			prn1.printLine("simple printer");
		}

		if (prn2 instanceof Printable) {
			prn2.printLine("multiful printer");
		}

		Scanner scanner = new Scanner();

		if (scanner instanceof Printable) {
			// scanner.printLine("multiful printer");
		}

	}

}
