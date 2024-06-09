package chapter07;
//5-8
//키오스크 상품 정하기
public class Kiosc {
	private String name;
	private int price;
	private int amount;
	
	public void setFood(String n, int p, int a) {
		name = n;
		price = p;
		amount = a;
	}
	
	public void getFood() {
		System.out.println(name +" "+ price +" "+ amount);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Kiosc kiosc1 = new Kiosc();
		kiosc1.setFood("싸이버거", 5000, 1);
		kiosc1.getFood();
		Kiosc kiosc2 = new Kiosc();
		kiosc2.setFood("불고기버거", 4000, 2);
		kiosc2.getFood();
	}

}
