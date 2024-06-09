package chapter07;
//5-24
public class RestaurantCons {
	private String name;
	private String location;
	private String food;
	
	public RestaurantCons(String name, String location, String food) {
		super();
		this.name = name;
		this.location = location;
		this.food = food;
	}

	@Override
	public String toString() {
		return "RestaurantCons [name=" + name + ", location=" + location + ", food=" + food + "]";
	}

	public static void main(String[] args) {
		RestaurantCons res = new RestaurantCons("맥도날드", "장전", "햄버거");
		System.out.println(res.toString());
	}

}
