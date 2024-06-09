package chapter07;
//5-17
public class Person {
	String name;
	String phoneNumber;
	
	public Person(String name, String phoneNumber) {
		//this 키워드를 붙여 주게 되면 인스턴스 변수를 지칭하게 된다
		//this: 자기 자신을 가리키고, 클래스 내부에서만 사용 가능
		//this.name == Person.name
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	/*
	 * public void setPerson(String n, String pn) {
	 *  	name = n;
	 * 		phoneNumber = pn;
	 * }
	 */
	
	//toString() 자동완성
	//인스턴스 변수에 어떤 값이 있는지 확인하는 용도
	//source - generate toString()
	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("정영훈", "010-1111-1111");
		System.out.println(p1.toString());
	}



	

}
