package chapter07;
//5-10
//회원 관리 프로그램
public class Membership {

	private String name;
	private int age;
	private String career;
	
	public void setMember(String n, int a, String c) {
		name = n;
		age = a;
		career = c;
	}
	
	public void getMember() {
		System.out.println(name + " " + age + " " + career);
	}
	public static void main(String[] args) {

		Membership member1 = new Membership();
		member1.setMember("춘자", 33, "은행원");
		member1.getMember();
		Membership member2 = new Membership();
		member2.setMember("복순", 28, "수의사");
		member2.getMember();
	}

}
