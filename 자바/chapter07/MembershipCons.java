package chapter07;
//5-30
public class MembershipCons {
	private String name;
	private int age;
	private String career;
	
	public MembershipCons(String name, int age, String career) {
		this.name = name;
		this.age = age;
		this.career = career;
	}
	
	@Override
	public String toString() {
		return "MembershipCons [name=" + name + ", age=" + age + ", career=" + career + "]";
	}

	public static void main(String[] args) {
		MembershipCons mem = new MembershipCons("정영훈", 24, "학생");
		System.out.println(mem.toString());
	}

}
