package chapter12;
//7-7
//오버라이딩(overriding)
//상위 클래스로부터 상속받은 메소드의 내용을 변경하는 것
//override: ~위에 덮어쓰다(overwrite)
public class Point {
	
	protected int x;
	private int y;
	
	public String what() {
		return "i am point";
	}

	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public String getLocation() {
		return "x: " + x + ", y:" + y;
	}
	
	public void parentMethod() {
		
	}
}
