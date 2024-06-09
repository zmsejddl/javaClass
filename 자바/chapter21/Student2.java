package chapter21;

public class Student2 {
	public int sno;
	public String name;
	
	public Student2(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno)&& (name.equals(student.name));
		}else {
			return false;
		}
		
	
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
	

	
}
