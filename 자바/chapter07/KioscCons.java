package chapter07;
//5-22
public class KioscCons {
	private String name;
	private int price;
	private int amount;
	
	
	public KioscCons(String name, int price, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "KioscCons [name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}


	public static void main(String[] args) {
		KioscCons kio = new KioscCons("콜라", 1000, 2);
		System.out.println(kio.toString());
	}

}
