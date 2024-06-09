package chapter07;
//5-28
public class DayCostCons {
	private String item;
	private int cost;
	private String purpose;

	public DayCostCons(String item, int cost, String purpose) {
		super();
		this.item = item;
		this.cost = cost;
		this.purpose = purpose;
	}
	
	@Override
	public String toString() {
		return "DayCostCons [item=" + item + ", cost=" + cost + ", purpose=" + purpose + "]";
	}
	public static void main(String[] args) {
		DayCostCons day = new DayCostCons("외투", 30000, "여행");
		System.out.println(day.toString());
	}

}
