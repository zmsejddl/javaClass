package chapter12;
//7-17
public class Point3D2 extends Point2{
	
	private int z;
	
	public Point3D2(int x, int y, int z) {
		super(x, y);
		//super()은 항상 첫문장에 위치하여야 한다
		this.z = z;
	}
	
}
