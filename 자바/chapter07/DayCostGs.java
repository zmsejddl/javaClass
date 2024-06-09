package chapter07;
//5-29
public class DayCostGs {
	private String item;
	private int cost;
	private String purpose;
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Override
	public String toString() {
		return "DayCostGs [item=" + item + ", cost=" + cost + ", purpose=" + purpose + "]";
	}

	public static void main(String[] args) {
		DayCostGs day = new DayCostGs();
		day.setItem("운동화");
		day.setCost(60000);
		day.setPurpose("기존 신발이 낡아서");
		System.out.println(day.toString());
	}

}
