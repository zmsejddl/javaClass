package chapter07;
//5-19
public class GetterSetter {
	private String name;
	private String phoneNumber;
	
	//게더세더 
	//게더 - 값을 가져 올때 사용하는 메소드
	//세더 - 값을 대입 할 때 사용하는 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		GetterSetter gs = new GetterSetter();
		System.out.println(gs.getName());
		gs.setName("정영훈");
		System.out.println(gs.getName());
		gs.setPhoneNumber("010-2222-3333");
		System.out.println(gs.getPhoneNumber());
		//DTO(data transfer object), VO(value object)
		//클래스들은 두가지 방법으로 값을 초기화
		//1.생성자 사용 
		//2.게더세터(getter setter) 사용
	}

	

}
