package chapter07;
//5-6
//운동 한개를 저장하는 클래스
public class Workout {
	private String name;
	private int set;
	private int times;
	private String rest;
	
	public void setWorkout(String n, int s, int t, String r) {
		name = n;
		set = s;
		times = t;
		rest = r;
	}
	
	public void getWorkout() {
		System.out.println("운동 이름: "+name);
		System.out.println("세트: " + set + ", 횟수: " + times + ", 총횟수: " + set*times);
		System.out.println("휴식 시간: " + rest + "분");
	}
	
	public static void main(String[] args) {
		Workout workout1 = new Workout();
		workout1.setWorkout("턱걸이", 10, 10, "10");
		workout1.getWorkout();
		Workout workout2 = new Workout();
		workout2.setWorkout("스쿼트", 10, 15, "5");
		workout2.getWorkout();
	}
	

}
