package chapter26;

import java.util.function.ToIntBiFunction;

//11-23
//3.인스턴스 없이 인스턴스 메소드 참조
public class IBox {
	
	private int n;
	public IBox(int i) {
		n = i;
	}
	
	public int larger(IBox b) {
		if(n>b.n)
			return n;
		else
			return b.n;
	}

	public static void main(String[] args) {

		IBox ib1 = new IBox(5);
		IBox ib2 = new IBox(7);
		int bigger = ib1.larger(ib2);
		System.out.println(bigger);
		//ToIntBiFunction<IBox, IBox> bf = (b1, b2) -> b1.larger(b2);
		//메소드 참조 변환
		ToIntBiFunction<IBox, IBox> bf = IBox::larger;
		int bigNum = bf.applyAsInt(ib1, ib2);
		System.out.println(bigNum);
		
	}

}
