package chapter27;

import java.util.Optional;

//12-3
public class ShowAddrWithOp {

	public static void main(String[] args) {

		//Optional 클래스를 사용하면 if~else문을 대신 할 수 있다
		Optional<ContInfo> ci = Optional.of(new ContInfo(null, "South Korea"));
		String phone = ci.map(c -> c.getPhone()).orElse("There is no phone number");
		String addr = ci.map(c -> c.getAddr()).orElse("There is no address");
		System.out.println(phone);
		System.out.println(addr);
		
		ContInfo c = new ContInfo(null, "South Korea");
		String phone1;
		if(c.getPhone() != null) {
			phone1 = c.getPhone();
		}else {
			phone = "There is no phone number";
		}
		System.out.println(phone);

		
		
		
		
	}

}
