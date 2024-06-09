package chapter11;
//6-23
public class Exercise6_4 {
	static double getDistance(int x, int y, int x1, int y2) {
		return Math.sqrt((x1-x)*(x1-x) + (y2-y)*(y2-y));
	}
	public static void main(String[] args) {

		System.out.println(getDistance(1,1,2,2));
	}

}
