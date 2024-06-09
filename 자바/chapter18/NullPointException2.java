package chapter18;
//8-20
public class NullPointException2 {
	
	private NullPointerException npe;
	
	public NullPointerException getNpe() {
		return npe;
	}

	public void setNpe(NullPointerException npe) {
		this.npe = npe;
	}

	public void sayHello() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		NullPointException2 npe2 = new NullPointException2();
		npe2.sayHello();
		npe2.getNpe().toString();
	}
	
}
