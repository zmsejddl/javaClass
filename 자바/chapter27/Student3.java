package chapter27;

public class Student3 {

	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	public Student3(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public boolean isMale() {
		return isMale;
	}

	public int getHak() {
		return hak;
	}

	public int getBan() {
		return ban;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student3 [name=" + name + ", isMale=" + isMale + ", hak=" + hak + ", ban=" + ban + ", score=" + score
				+ "]";
	}
	
	enum Level{
		HIGH, MID, LOW
	}
	
	
	
}
