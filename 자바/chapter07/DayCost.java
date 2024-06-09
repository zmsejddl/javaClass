package chapter07;
//5-9
//가계부 입력
public class DayCost {
	private String item;
	private int cost;
	private String purpose;
	
	public void setDay(String i, int c, String p) {
		item = i;
		cost = c;
		purpose = p;
	}
	
	public void getDay() {
		System.out.println(item + " " + cost + " "+ purpose);
	}
	public static void main(String[] args) {

		DayCost day1 = new DayCost();
		day1.setDay("양말", 2000, "기존 양말에 구멍이 생김");
		day1.getDay();
		DayCost day2 = new DayCost();
		day2.setDay("외투", 22000, "세일 하는 걸 샀음");
		day2.getDay();
	}

}
