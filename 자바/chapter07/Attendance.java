package chapter07;
//5-4
//출석 관리 프로그램
//변수 앞에 private, 메소드 앞에는 public을 일단 붙이기
public class Attendance {
	private String studentName;
	private String enterRoomTime;
	private String leavingRoomTime;
	
	public void setAttendance(String s, String e, String l) {
		studentName = s;
		enterRoomTime = e;
		leavingRoomTime = l;
	}
	
	public void getAttendance() {
		System.out.println("훈련생 이름: " + studentName);
		System.out.println("입실 시간: " + enterRoomTime);
		System.out.println("퇴실 시간: " + leavingRoomTime);
	}
	
	public static void main(String[] args) {
		Attendance attendance1 = new Attendance();
		attendance1.setAttendance("정영훈", "8시 30분", "16시 50분");
		attendance1.getAttendance();
		Attendance attendance2 = new Attendance();
		attendance2.setAttendance("정재형", "8시 50분", "16시 53분");
		attendance2.getAttendance();
	}

}
