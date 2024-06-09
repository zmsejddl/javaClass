package chapter07;
//5-12
//연락처 관리
public class PhoneNumber {
	private String name;
	private String relationship;
	private String number;
	
	public void setPhoneNumber(String n, String r, String nu) {
		name = n;
		relationship = r;
		number = nu;
	}
	
	public void getPhoneNumber() {
		System.out.println(name + " " + relationship + " " + number);
	}
	
	public static void main(String[] args) {

		PhoneNumber number1 = new PhoneNumber();
		number1.setPhoneNumber("덕자", "친구", "010-1111-2222");
		number1.getPhoneNumber();
		PhoneNumber number2 = new PhoneNumber();
		number2.setPhoneNumber("길순", "사촌", "010-1234-5678");
		number2.getPhoneNumber();
	}

}
