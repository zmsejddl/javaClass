package chapter07;
//5-21
public class AttendanceGS {
	private String studentName;
	private String enterRoomTime;
	private String leavingRoomTime;
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEnterRoomTime() {
		return enterRoomTime;
	}

	public void setEnterRoomTime(String enterRoomTime) {
		this.enterRoomTime = enterRoomTime;
	}

	public String getLeavingRoomTime() {
		return leavingRoomTime;
	}

	public void setLeavingRoomTime(String leavingRoomTime) {
		this.leavingRoomTime = leavingRoomTime;
	}

	@Override
	public String toString() {
		return "AttendanceGS [studentName=" + studentName + ", enterRoomTime=" + enterRoomTime + ", leavingRoomTime="
				+ leavingRoomTime + "]";
	}

	public static void main(String[] args) {
		AttendanceGS ags = new AttendanceGS();
		ags.setStudentName("정영훈");
		ags.setEnterRoomTime("8시 50분");
		ags.setLeavingRoomTime("17시 50분");
		System.out.println(ags.toString());
		//1. 생성자 사용
		//2. 게더세더 사용
		//4:50분 전까지 오전에 만들었던 5개 클래스를 두개의 방법으로 변환(자동 완성 사용)
	}

}
