package chapter07;
//5-27
public class PhoneNumberGS {
	private String name;
	private String relationship;
	private String number;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PhoneNumberGS [name=" + name + ", relationship=" + relationship + ", number=" + number + "]";
	}

	public static void main(String[] args) {
		PhoneNumberGS pho = new PhoneNumberGS();
		pho.setName("정영훈");
		pho.setRelationship("동생");
		pho.setNumber("010-1234-5677");
		System.out.println(pho.toString());
	}

}
