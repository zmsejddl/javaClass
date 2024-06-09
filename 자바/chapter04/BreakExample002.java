package chapter04;
//4-2
public class BreakExample002 {

	public static void main(String[] args) {

		//break 키워드, 예약어, 문
		for(int i = 0; i<10;i++) {
			System.out.println("java1");
			System.out.println(i);
			if(i==3) {
				break;
			}
			System.out.println("java2");
		}
		System.out.println();
		//while문을 이용해서 주사위 번호 중 하나를 반복적으로 무작위로 뽑되
		//6이 나오면 while문을 종료
		int count = 0;
		while(true) {
			count++;
			int num = (int)(Math.random()*6+1);
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println(count+"회");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
