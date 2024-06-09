package chapter07;
//5-20
public class AttendanceCons {
	private String studentName;
	private String enterRoomTime;
	private String leavingRoomTime;
	
	public AttendanceCons(String studentName, String enterRoomTime, String leavingRoomTime) {
		super();
		this.studentName = studentName;
		this.enterRoomTime = enterRoomTime;
		this.leavingRoomTime = leavingRoomTime;
	}

	@Override
	public String toString() {
		return "AttendanceCons [studentName=" + studentName + ", enterRoomTime=" + enterRoomTime + ", leavingRoomTime="
				+ leavingRoomTime + "]";
	}


	public static void main(String[] args) {
		//1.생성자로 인스턴스 변수 값을 초기화
		AttendanceCons ac = new AttendanceCons("정영훈", "08시 50분", "17시 50분");
		System.out.println(ac.toString());
	}

}
