package chapter07;
//5-11
//맛집 리스트
public class Restaurant {

	private String name;
	private String location;
	private String food;
	
	public void setRestaurant(String n, String l, String f) {
		name = n;
		location = l;
		food = f;
	}
	
	public void getRestaurant() {
		System.out.println(name + " " + location + " " + food);
	}
	public static void main(String[] args) {

		Restaurant restaurant1 = new Restaurant();
		restaurant1.setRestaurant("맥도날드", "서면", "햄버거");
		restaurant1.getRestaurant();
		Restaurant restaurant2 = new Restaurant();
		restaurant2.setRestaurant("이삭토스트", "장전", "토스트");
		restaurant2.getRestaurant();
	}

}
