package chapter07;
//5-31
public class MembershipGS {
	private String name;
	private int age;
	private String career;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	@Override
	public String toString() {
		return "MembershipGS [name=" + name + ", age=" + age + ", career=" + career + "]";
	}

	public static void main(String[] args) {
		MembershipGS mem = new MembershipGS();
		mem.setName("복자");
		mem.setAge(40);
		mem.setCareer("검사");
		System.out.println(mem.toString());
	}

}
