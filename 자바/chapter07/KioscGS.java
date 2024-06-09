package chapter07;
//5-23
public class KioscGS {
	private String name;
	private int price;
	private int amount;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "KioscGS [name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}

	public static void main(String[] args) {
		KioscGS kio = new KioscGS();
		kio.setName("맥주");
		kio.setPrice(4000);
		kio.setAmount(2);
		System.out.println(kio.toString());
	}

}
