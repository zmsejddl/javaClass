package chapter11;
//6-22
public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public Student() {
		
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math;
	}

	public int getTotal() {
		return kor+eng+math;
	}
	
	public float getAverage() {
		return  (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
	}
	

}
