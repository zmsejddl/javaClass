package chapter07;
//5-25
public class RestaurantGS {
	private String name;
	private String location;
	private String food;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "RestaurantGS [name=" + name + ", location=" + location + ", food=" + food + "]";
	}

	public static void main(String[] args) {
		RestaurantGS res = new RestaurantGS();
		res.setName("롯데리아");
		res.setLocation("서면");
		res.setFood("아이스크림");
		System.out.println(res.toString());
	}

}
