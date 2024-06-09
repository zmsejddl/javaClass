package chapter04;
//3-9
public class DongbackPass {

	public static void main(String[] args) {

		/*
		 * 동백패스 제도를 잘 보시고, 
		 * 한달 쓴 금액을 변수로 지정하여 얼마 환급을 받을 수 있는지 if문으로 작성해 보세요.
		 * 
		 * else if
		 * 4.5만원 환급
		 * 최대 4.5만원 환급
		 */
		
		/*
		 * 내가 한거
		 * int busPay = 100000;
		
		if ((busPay > 45000) && (busPay < 90000)) {
			System.out.println((busPay - 45000)+"원을 환급받을 수 있습니다");
		}else if(busPay >= 90000) {
				System.out.println("45000원을 환급받을 수 있습니다");
		}else {
			System.out.println("환급받을 수 없습니다");
		}
		 */
		int payMoney = 90000;
		if(payMoney <= 45000) {
			System.out.println("환급할 금액이 없다");
		}else if(payMoney <= 90000) {
			//System.out.println("환급 금액: "+ (90000-payMoney));
			int payBack = payMoney-45000;
			System.out.println("환급 금액: "+payBack);
		}else {
			System.out.println("환급 금액: 45000원");
		}
		
		
	}

}
