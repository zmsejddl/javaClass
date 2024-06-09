package chapter12.c27;

//7-29
public class Buyer {
	private int bonusPoint = 0;

	public void buy(Product p) {
		p.who();
	}

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Tv());
		buyer.buy(new Computer());

		Tv tv = new Tv();
		buyer.buy(tv);

		Computer com = new Computer();
		buyer.buy(com);
	}
}
