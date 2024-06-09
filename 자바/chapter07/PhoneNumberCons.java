package chapter07;
//5-26
public class PhoneNumberCons {
	private String name;
	private String relationship;
	private String number;
	
	public PhoneNumberCons(String name, String relationship, String number) {
		super();
		this.name = name;
		this.relationship = relationship;
		this.number = number;
	}

	@Override
	public String toString() {
		return "PhoneNumberCons [name=" + name + ", relationship=" + relationship + ", number=" + number + "]";
	}

	public static void main(String[] args) {
		PhoneNumberCons pho = new PhoneNumberCons("정영훈", "본인", "010-2222-3333");
		System.out.println(pho.toString());
	}

}
