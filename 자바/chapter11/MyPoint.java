package chapter11;
//6-25
public class MyPoint {
	int x;
	int y;
	
	public MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	public double getDistance(int x1, int y2) {
		return Math.sqrt((x1-x)*(x1-x) + (y2-y)*(y2-y));
	}
}
